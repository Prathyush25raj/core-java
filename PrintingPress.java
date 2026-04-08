class PrintingPress {

    String name;
    String location;
    int numberOfMachines;
    int numberOfWorkers;
    String managerName;
    boolean hasColorPrint;
    boolean hasBinding;
    double printingCost;
    int establishedYear;
    String pressType;

    static String country = "India";
    static String type = "Printing";

    public String printDocument(String doc) {
        System.out.println("Document Printed: " + doc);
        return doc;
    }

    public String bindDocument(String doc) {
        System.out.println("Document Bound: " + doc);
        return doc;
    }

    public String designDocument(String doc) {
        System.out.println("Document Designed: " + doc);
        return doc;
    }

    public double collectPayment(double amount) {
        System.out.println("Payment: " + amount);
        return amount;
    }

    public boolean startMachine(boolean status) {
        System.out.println("Machine Started: " + status);
        return status;
    }

    public boolean stopMachine(boolean status) {
        System.out.println("Machine Stopped: " + status);
        return status;
    }

    public int countOrders(int total) {
        System.out.println("Orders: " + total);
        return total;
    }

    public boolean provideDelivery(boolean status) {
        System.out.println("Delivery: " + status);
        return status;
    }

    public String assignOperator(String operator) {
        System.out.println("Operator Assigned: " + operator);
        return operator;
    }

    public boolean maintainQuality(boolean status) {
        System.out.println("Quality Maintained: " + status);
        return status;
    }
}