package sensors;

public class AmbulanceSensor {
    private double soundLevel;
    private double distance;

    public AmbulanceSensor(double soundLevel, double distance) {
        this.soundLevel = soundLevel;
        this.distance = distance;
    }

    public double getSoundLevel() { return soundLevel; }
    public double getDistance() { return distance; }
}
