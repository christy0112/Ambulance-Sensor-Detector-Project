🚑 Ambulance Sensor Detector – Java + Arduino Project
📌 Project Overview
This project simulates a smart traffic signal system that detects ambulances and automatically turns the signal green to allow them to pass.

It uses:

Java (for decision-making – simulating sound and distance readings)

Arduino (for controlling real LEDs representing traffic lights)

When the system detects:

Ambulance detected → Green light ON (Red OFF)

No ambulance → Red light ON (Green OFF)

This demonstrates how IoT + Java programming can be used for smart city traffic control.

🛠 Requirements
Hardware
Arduino Uno / Nano / Mega

1 × Red LED

1 × Green LED

2 × 220Ω Resistors

Breadboard + jumper wires

USB cable to connect Arduino to PC

Software
Java IDE (Eclipse / IntelliJ / VS Code with Java)

Arduino IDE (latest version)

jSerialComm library for Java (download: https://fazecast.github.io/jSerialComm/)

⚡ Circuit Diagram
Connections:

Red LED → Pin 8 (through 220Ω resistor to GND)

Green LED → Pin 9 (through 220Ω resistor to GND)

Connect Arduino to PC via USB

🖼 Visual Example:
Arduino Pin 8 ---[220Ω]---|>|--- GND  (Red LED)
Arduino Pin 9 ---[220Ω]---|>|--- GND  (Green LED)
▶ How to Run
Build Circuit (LEDs, resistors, Arduino).

Upload Arduino Code using Arduino IDE.

Close Serial Monitor (important – Java will use the port).

Run Java Code from your Java IDE.

Observe:

Console prints simulated sound & distance.

Green LED ON when ambulance detected.

Red LED ON when normal traffic.

📸 Demo (Optional)
Take a photo or short video of your working setup and upload it here (GitHub supports .gif or image links).

📚 Future Improvements
Use real sound sensor on Arduino instead of random data.

Add buzzer to alert nearby traffic.

Extend to multiple traffic signals with priority control.
