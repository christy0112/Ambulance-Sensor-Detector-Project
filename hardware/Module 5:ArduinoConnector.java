package hardware;

import com.fazecast.jSerialComm.SerialPort;

public class ArduinoConnector {
    private SerialPort port;
    private boolean connected = false;

    public ArduinoConnector(String portName) {
        port = SerialPort.getCommPort(portName);
        try {
            port.setComPortParameters(9600, 8, 1, 0);
            port.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0);
            connected = port.openPort();
        } catch (Exception e) {
            System.out.println("Arduino not connected, running in simulation mode");
        }
    }

    public void sendCommand(char c) {
        if (!connected) return;
        try {
            port.getOutputStream().write(c);
            port.getOutputStream().flush();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void close() { if(connected) port.closePort(); }
}
