class WeatherStation {

    String name;
    String location;
    int numberOfSensors;
    int numberOfStaff;
    String managerName;
    boolean hasRainGauge;
    boolean hasWindSensor;
    double temperature;
    int establishedYear;
    String stationType;

    static String country = "India";
    static String type = "Climate";

    public String recordTemperature(String temp) {
        System.out.println("Temperature Recorded: " + temp);
        return temp;
    }

    public String recordRainfall(String rain) {
        System.out.println("Rainfall Recorded: " + rain);
        return rain;
    }

    public String recordWind(String wind) {
        System.out.println("Wind Recorded: " + wind);
        return wind;
    }

    public double calculateAverage(double avg) {
        System.out.println("Average: " + avg);
        return avg;
    }

    public boolean startStation(boolean status) {
        System.out.println("Station Started: " + status);
        return status;
    }

    public boolean stopStation(boolean status) {
        System.out.println("Station Stopped: " + status);
        return status;
    }

    public int countReports(int total) {
        System.out.println("Reports: " + total);
        return total;
    }

    public boolean sendAlert(boolean status) {
        System.out.println("Alert Sent: " + status);
        return status;
    }

    public String assignArea(String area) {
        System.out.println("Area Assigned: " + area);
        return area;
    }

    public boolean maintainEquipment(boolean status) {
        System.out.println("Equipment Maintained: " + status);
        return status;
    }
}