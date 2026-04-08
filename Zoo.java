class Zoo {

    String name;
    String location;
    int numberOfAnimals;
    int numberOfStaff;
    String managerName;
    boolean hasSafari;
    boolean hasBirdSection;
    double ticketPrice;
    int establishedYear;
    String zooType;

    static String country = "India";
    static String type = "Wildlife";

    public String addAnimal(String animal) { System.out.println("Animal Added: " + animal); return animal; }
    public String removeAnimal(String animal) { System.out.println("Animal Removed: " + animal); return animal; }
    public String feedAnimal(String animal) { System.out.println("Animal Fed: " + animal); return animal; }
    public double collectTicket(double amount) { System.out.println("Ticket: " + amount); return amount; }
    public boolean openZoo(boolean status) { System.out.println("Open: " + status); return status; }
    public boolean closeZoo(boolean status) { System.out.println("Close: " + status); return status; }
    public int countVisitors(int total) { System.out.println("Visitors: " + total); return total; }
    public boolean provideSecurity(boolean status) { System.out.println("Security: " + status); return status; }
    public String assignSection(String section) { System.out.println("Section: " + section); return section; }
    public boolean maintainHygiene(boolean status) { System.out.println("Hygiene: " + status); return status; }
}