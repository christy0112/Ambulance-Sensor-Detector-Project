package controller;

public class TrafficController {
    public void handleAmbulanceDetected() {
        System.out.println("🚨 Ambulance detected! Turning traffic light GREEN...");
    }

    public void handleNoAmbulance() {
        System.out.println("✅ No ambulance detected. Normal traffic flow.");
    }
}
