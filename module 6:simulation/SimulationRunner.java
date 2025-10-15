package simulation;

import java.util.Random;
import sensors.AmbulanceSensor;
import detection.AmbulanceDetector;
import controller.TrafficController;
import hardware.ArduinoConnector;

public class SimulationRunner {
    public static void runSimulation() {
        Random random = new Random();
        TrafficController controller = new TrafficController();
        ArduinoConnector arduino = new ArduinoConnector("COM3");
        AmbulanceDetector detector = new AmbulanceDetector();

        for(int i=1; i<=10; i++){
            double sound = 60 + random.nextDouble() * 50;
            double distance = random.nextDouble() * 200;
            AmbulanceSensor sensor = new AmbulanceSensor(sound, distance);

            System.out.printf("Reading %d: Sound=%.2f dB, Distance=%.2f m\n",
                    i, sensor.getSoundLevel(), sensor.getDistance());

            if(detector.detect(sensor)){
                controller.handleAmbulanceDetected();
                arduino.sendCommand('G');
            } else {
                controller.handleNoAmbulance();
                arduino.sendCommand('N');
            }

            try { Thread.sleep(1500); } catch (InterruptedException e) {}
        }

        arduino.close();
    }
}
