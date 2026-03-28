class Apps {

    String appName;
    float sizeInMb;
    float ratings;
    String companyName;
    String releaseDate;
    String version;
    long noOfDownloads;
    long noOfReviews;

    public void display() {
        System.out.println("App Name: " + appName);
    }

    public static void main(String[] args) {
        Apps app = new Apps();   // object creation
        app.appName = "Instagram";  // assigning value
        app.display();  // method call
    }
}