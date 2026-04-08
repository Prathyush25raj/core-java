class ShopRunner {

    public static void main(String[] args) {

        Shop s1 = new Shop();
        s1.shopName = "Fresh Mart";
        s1.location = "Bangalore";
        s1.ownerName = "Ravi";
        s1.shopType = "Grocery";
        s1.dailyIncome = 5000;
        s1.displayShopDetails();

        Shop s2 = new Shop("Tech World", "Mumbai", "Amit", "Electronics", 15000);
        s2.displayShopDetails();

        Shop s3 = new Shop("Style Hub", "Delhi", "Neha", "Clothing", 12000);
        s3.displayShopDetails();

        Shop s4 = new Shop("Book Land", "Chennai", "Suresh", "Bookstore", 4000);
        s4.displayShopDetails();


	}
}