 class AjioRunner 
{
    public static void main(String[] args) 
    {
      
        Ajio ajioApp = new Ajio();

   
        String selectedItem = "Shoes";
        int quantity = 2;

        System.out.println("Welcome to AJIO: Trends at Your Doorstep");

     
        double unitPrice = ajioApp.getPriceByProduct(selectedItem);

        if (unitPrice > 0.0) 
        {
     
            double subtotal = ajioApp.getTotal(unitPrice, quantity);
            
     
            double finalBill = ajioApp.getDiscount(subtotal);

        
        
            System.out.println("Product     : " + selectedItem);
            System.out.println("Unit Price  : " + unitPrice);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Subtotal    : " + subtotal);
            System.out.println("Final Bill  : " + finalBill + " (Discounted)");
    
        } 
        else 
        {
            System.out.println("Error: The product '" + selectedItem + "' is not available in Ajio trends.");
        }
    }
}