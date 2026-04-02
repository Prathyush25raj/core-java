class MintraRunner {

  public static void main(String[] arg) {

    Mintra mintra = new Mintra();

    boolean login = mintra.login("prathyush", "prathi@123");
    System.out.println(login);
    
	
	
    String result = mintra.login(9353560292L, 1234);
    System.out.println(result);
	
	
    
    String msg = mintra.search("laptop");
    System.out.println(msg);
	
    msg = mintra.search("laptop", "Hp");
    System.out.println(msg);
	
    
    msg = mintra.search("laptop", "Hp", 90000);
    System.out.println(msg);


    msg = mintra.search("laptop", "Hp", 90000, "white");
    System.out.println(msg);

    msg = mintra.search("phone", "Hp", 90000, "white", "16GB");
    System.out.println(msg);
	
	
  }
}