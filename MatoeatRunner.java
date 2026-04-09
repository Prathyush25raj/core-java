class MatoeatRunner 
{
    public static void main(String[] args) 
    {
        // 1. Create an object of the Matoeat class
        Matoeat matoeat = new Matoeat();

        // 2. Define the order details
        String item = "Fried Rice";
        int quantity = 2;

        System.out.println("Starting  Order System ");

        // 3. Get the price for the specific food item
        double pricePerItem = matoeat.getPriceByFoodName(item);

        if (pricePerItem > 0) 
        {
            // 4. Calculate total amount based on quantity
            double totalAmount = matoeat.getTotalAmountByPriceAndQuantity(pricePerItem, quantity);
            System.out.println("Total for " + quantity + " " + item + "(s): " + totalAmount);

            // 5. Calculate final price after a 10% discount
            double finalPrice = matoeat.getDiscount(totalAmount);
            
            
            System.out.println("Final Bill (After 10% Discount): " + finalPrice);
            
        } 
        else 
        {
            System.out.println("Sorry, " + item + " is not available on our menu.");
        }
    }
}