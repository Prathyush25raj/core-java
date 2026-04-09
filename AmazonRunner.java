class AmazonRunner
{
	public static void main(String[] args)
	{
		Amazon a = new Amazon();

		double price = a.getPriceByProduct("Mobile");
		System.out.println("Price: " + price);

		double total = a.getTotal(price, 2);
		System.out.println("Total: " + total);

		double discount = a.getDiscount(total);
		System.out.println("Final Price: " + discount);
	}
}