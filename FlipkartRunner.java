class FlipkartRunner {

  public static void main(String[] arg) {

    Flipkart Flipkart = new Flipkart();

    boolean login = Flipkart.login("prathyush", "prathi@123");
    System.out.println(login);
    
	
	
    String result = Flipkart.login(9353560292L, 1234);
    System.out.println(result);
	
	
    
    String msg = Flipkart.search("mobile");
    System.out.println(msg);
	
    msg = Flipkart.search("mobile", "Nothing");
    System.out.println(msg);
	
    
    msg = Flipkart.search("mobile", "Nothing", 30000);
    System.out.println(msg);


    msg = Flipkart.search("mobile", "Nothing", 30000, "white");
    System.out.println(msg);

    msg = Flipkart.search("mobile", "Nothing", 30000, "white", "8GB");
    System.out.println(msg);
	
	
  }
}