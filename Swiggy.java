class Swiggy {
    public double getPrice(String food) {
        if("Pizza".equals(food)) return 150;
        else if("Burger".equals(food)) return 80;
        return 0;
    }

    public double getTotal(double price, int qty) {
        return price * qty;
    }

    public double getDiscount(double total) {
        return total * 0.9;
    }
}