class DeliveryService {

    String name;
    String location;
    int numberOfOrders;
    int numberOfAgents;
    String managerName;
    boolean hasTracking;
    boolean hasExpressDelivery;
    double deliveryCharge;
    int establishedYear;
    String serviceType;

    static String country = "India";
    static String type = "Logistics";

    public String placeOrder(String order) {
        System.out.println("Order Placed: " + order);
        return order;
    }

    public String cancelOrder(String order) {
        System.out.println("Order Cancelled: " + order);
        return order;
    }

    public String deliverOrder(String order) {
        System.out.println("Order Delivered: " + order);
        return order;
    }

    public double collectCharge(double amount) {
        System.out.println("Charge: " + amount);
        return amount;
    }

    public boolean startDelivery(boolean status) {
        System.out.println("Delivery Started: " + status);
        return status;
    }

    public boolean stopDelivery(boolean status) {
        System.out.println("Delivery Stopped: " + status);
        return status;
    }

    public int countOrders(int total) {
        System.out.println("Orders: " + total);
        return total;
    }

    public boolean provideTracking(boolean status) {
        System.out.println("Tracking Available: " + status);
        return status;
    }

    public String assignAgent(String agent) {
        System.out.println("Agent Assigned: " + agent);
        return agent;
    }

    public boolean maintainSpeed(boolean status) {
        System.out.println("Speed Maintained: " + status);
        return status;
    }
}