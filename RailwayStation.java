class RailwayStation {

    String name;
    String location;
    int numberOfPlatforms;
    int numberOfStaff;
    String managerName;
    boolean hasWaitingHall;
    boolean hasFoodCourt;
    double totalRevenue;
    int establishedYear;
    String stationType;

    static String country = "India";
    static String type = "Transport";

    public String scheduleTrain(String train) {
        System.out.println("Train Scheduled: " + train);
        return train;
    }

    public String cancelTrain(String train) {
        System.out.println("Train Cancelled: " + train);
        return train;
    }

    public String assignPlatform(String platform) {
        System.out.println("Platform Assigned: " + platform);
        return platform;
    }

    public double collectFare(double amount) {
        System.out.println("Fare: " + amount);
        return amount;
    }

    public boolean startTrain(boolean status) {
        System.out.println("Train Started: " + status);
        return status;
    }

    public boolean stopTrain(boolean status) {
        System.out.println("Train Stopped: " + status);
        return status;
    }

    public int countPassengers(int total) {
        System.out.println("Passengers: " + total);
        return total;
    }

    public boolean provideService(boolean status) {
        System.out.println("Service: " + status);
        return status;
    }

    public String assignCoach(String coach) {
        System.out.println("Coach Assigned: " + coach);
        return coach;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness: " + status);
        return status;
    }
}