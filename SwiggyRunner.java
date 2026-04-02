class SwiggyRunner {

  public static void main(String[] arg) {

    Swiggy Swiggy = new Swiggy();

    boolean login = Swiggy.login("prathyush", "prathi@123");
    System.out.println(login);
    
	
	
    String result = Swiggy.login(9353560292L, 1234);
    System.out.println(result);
	
	
    
    String msg = Swiggy.search("tandoori");
    System.out.println(msg);
	
    msg = Swiggy.search("tandoori", "chikan tandoori");
    System.out.println(msg);
	
    
    msg = Swiggy.search("tandoori", "chikan tandoori", 500);
    System.out.println(msg);


    msg = Swiggy.search("tandoori", "chikan tandoori", 500, "BangloreDish");
    System.out.println(msg);

    msg = Swiggy.search("tandoori", "chikan tandoori", 500, "BangloreDish", 5);
    System.out.println(msg);
	
	
  }
}