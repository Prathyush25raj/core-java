class App {

    String appName;
    String developer;
    String category;
    double rating;
    static String platform = "Android";

    public App() {
    }

    public App(String appName, String developer, String category, double rating) {
        this.appName = appName;
        this.developer = developer;
        this.category = category;
        this.rating = rating;
    }

    public void displayAppDetails() {
        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developer);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
        System.out.println("Platform: " + platform);
    }
}

