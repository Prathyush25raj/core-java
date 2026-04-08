class PowerPlant {

    String name;
    String location;
    int numberOfUnits;
    int numberOfWorkers;
    String managerName;
    boolean hasSolar;
    boolean hasThermal;
    double powerOutput;
    int establishedYear;
    String plantType;

    static String country = "India";
    static String type = "Energy";

    public String generatePower(String source) {
        System.out.println("Power Generated: " + source);
        return source;
    }

    public String distributePower(String area) {
        System.out.println("Power Distributed: " + area);
        return area;
    }

    public String shutdownUnit(String unit) {
        System.out.println("Unit Shutdown: " + unit);
        return unit;
    }

    public double calculateOutput(double output) {
        System.out.println("Output: " + output);
        return output;
    }

    public boolean startPlant(boolean status) {
        System.out.println("Plant Started: " + status);
        return status;
    }

    public boolean stopPlant(boolean status) {
        System.out.println("Plant Stopped: " + status);
        return status;
    }

    public int countUnits(int total) {
        System.out.println("Units: " + total);
        return total;
    }

    public boolean provideBackup(boolean status) {
        System.out.println("Backup Provided: " + status);
        return status;
    }

    public String assignOperator(String operator) {
        System.out.println("Operator Assigned: " + operator);
        return operator;
    }

    public boolean maintainSafety(boolean status) {
        System.out.println("Safety Maintained: " + status);
        return status;
    }
}