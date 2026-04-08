class Airport {

    String airportName;
    String location;
    int numberOfFlights;
    int numberOfStaff;
    String managerName;
    boolean hasInternationalFlights;
    boolean hasCargoService;
    double ticketPrice;
    int establishedYear;
    String airportType;

    static String country = "India";
    static String type = "Transport";

    public String bookFlight(String flightName) {
        System.out.println("Flight Booked: " + flightName);
        return flightName;
    }

    public String cancelFlight(String flightName) {
        System.out.println("Flight Cancelled: " + flightName);
        return flightName;
    }

    public String scheduleFlight(String flightName) {
        System.out.println("Flight Scheduled: " + flightName);
        return flightName;
    }

    public double collectFare(double amount) {
        System.out.println("Fare Collected: " + amount);
        return amount;
    }

    public boolean startFlight(boolean status) {
        System.out.println("Flight Started: " + status);
        return status;
    }

    public boolean stopFlight(boolean status) {
        System.out.println("Flight Stopped: " + status);
        return status;
    }

    public int countPassengers(int total) {
        System.out.println("Total Passengers: " + total);
        return total;
    }

    public boolean provideFood(boolean status) {
        System.out.println("Food Service: " + status);
        return status;
    }

    public String assignGate(String gate) {
        System.out.println("Gate Assigned: " + gate);
        return gate;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }
}