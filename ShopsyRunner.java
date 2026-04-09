 class ShopsyRunner 
{
	public static void main(String[] args) 
	{
	
		Shopsy shopsyApp = new Shopsy();

		String myProduct = "Laptop";
		int myQty = 1;

		System.out.println("Welcome to Shopsy - Your Shopping Destination");

	
		double price = shopsyApp.getPriceByProduct(myProduct);

		if (price > 0) 
		{

			double totalAmount = shopsyApp.getTotal(price, myQty);
			
			
			double finalBill = shopsyApp.getDiscount(totalAmount);
			
			System.out.println("Product:  " + myProduct);
	}
	}