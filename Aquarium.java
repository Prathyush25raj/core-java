class Aquarium {

    String name;
    String location;
    int numberOfTanks;
    int numberOfFish;
    String managerName;
    boolean hasSaltWater;
    boolean hasFreshWater;
    double ticketPrice;
    int establishedYear;
    String aquariumType;

    static String country = "India";
    static String type = "Tourism";

    public String addFish(String fish) { System.out.println("Fish Added: " + fish); return fish; }
    public String removeFish(String fish) { System.out.println("Fish Removed: " + fish); return fish; }
    public String feedFish(String fish) { System.out.println("Fish Fed: " + fish); return fish; }
    public double collectTicket(double amount) { System.out.println("Ticket: " + amount); return amount; }
    public boolean openAquarium(boolean status) { System.out.println("Open: " + status); return status; }
    public boolean closeAquarium(boolean status) { System.out.println("Close: " + status); return status; }
    public int countVisitors(int total) { System.out.println("Visitors: " + total); return total; }
    public boolean maintainWater(boolean status) { System.out.println("Water Maintained: " + status); return status; }
    public String assignTank(String tank) { System.out.println("Tank Assigned: " + tank); return tank; }
    public boolean maintainCleanliness(boolean status) { System.out.println("Cleanliness: " + status); return status; }
}