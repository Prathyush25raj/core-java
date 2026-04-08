class AppRunner {

    public static void main(String[] args) {

        App a1 = new App();
        a1.appName = "WhatsApp";
        a1.developer = "Meta";
        a1.category = "Messaging";
        a1.rating = 4.5;
        a1.displayAppDetails();

        App a2 = new App("Instagram", "Meta", "Social Media", 4.4);
        a2.displayAppDetails();

        App a3 = new App("YouTube", "Google", "Video Streaming", 4.6);
        a3.displayAppDetails();

        App a4 = new App("Spotify", "Spotify Ltd", "Music", 4.3);
        a4.displayAppDetails();

        App a5 = new App("Google Maps", "Google", "Navigation", 4.7);
        a5.displayAppDetails();
    }
}