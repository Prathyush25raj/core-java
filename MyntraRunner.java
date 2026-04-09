class MyntraRunner 
{
	public static void main(String[] args) 
	{
	
		Myntra myntraApp = new Myntra();

		String productToBuy = "Headphones";
		int quantity = 3;

		System.out.println("--- Welcome to Myntra Shopping ---");

		double unitPrice = myntraApp.getPriceByProduct(productToBuy);

		if (unitPrice > 0) 
		{
		
			double totalAmount = myntraApp.getTotal(unitPrice, quantity);
		}
