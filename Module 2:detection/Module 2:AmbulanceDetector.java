package detection;

import sensors.AmbulanceSensor;

public class AmbulanceDetector {
    private double soundThreshold = 80;
    private double distanceThreshold = 100;
    private int requiredConsecutive = 2;
    private int consecutiveHighReadings = 0;

    public boolean detect(AmbulanceSensor sensor) {
        if(sensor.getSoundLevel() > soundThreshold && sensor.getDistance() < distanceThreshold){
            consecutiveHighReadings++;
        } else {
            consecutiveHighReadings = 0;
        }
        return consecutiveHighReadings >= requiredConsecutive;
    }
}
