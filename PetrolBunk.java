class PetrolBunk {

    String name;
    String location;
    int numberOfPumps;
    int numberOfStaff;
    String managerName;
    boolean hasDiesel;
    boolean hasPetrol;
    double totalSales;
    int establishedYear;
    String bunkType;

    static String country = "India";
    static String type = "Fuel";

    public String fillFuel(String vehicle) { System.out.println("Fuel Filled: " + vehicle); return vehicle; }
    public String checkOil(String vehicle) { System.out.println("Oil Checked: " + vehicle); return vehicle; }
    public String washVehicle(String vehicle) { System.out.println("Vehicle Washed: " + vehicle); return vehicle; }
    public double collectAmount(double amount) { System.out.println("Amount: " + amount); return amount; }
    public boolean openBunk(boolean status) { System.out.println("Open: " + status); return status; }
    public boolean closeBunk(boolean status) { System.out.println("Close: " + status); return status; }
    public int countVehicles(int total) { System.out.println("Vehicles: " + total); return total; }
    public boolean provideAir(boolean status) { System.out.println("Air Service: " + status); return status; }
    public String assignPump(String pump) { System.out.println("Pump Assigned: " + pump); return pump; }
    public boolean maintainSafety(boolean status) { System.out.println("Safety: " + status); return status; }
}