class EatRunner 
{
    public static void main(String[] args) 
    {
        
        Eat eat = new Eat();

       
        String item = "Fried Rice";
        int quantity = 2;

        System.out.println("Starting  Order System ");

        double pricePerItem = Eat.getPriceByFoodName(item);

        if (pricePerItem > 0) 
        {
 
            double totalAmount = eat.getTotalAmountByPriceAndQuantity(pricePerItem, quantity);
            System.out.println("Total for " + quantity + " " + item + "(s): " + totalAmount);

       
            double finalPrice = eat.getDiscount(totalAmount);
            
            
            System.out.println("Final Bill (After 10% Discount): " + finalPrice);
            
        } 
        else 
        {
            System.out.println("Sorry, " + item + " is not available on our menu.");
        }
    }
}