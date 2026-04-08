class Window {

    public static void displayWindowType(String type) {
        System.out.println("Window Type: " + type);
    }

    static double price = 3500;

    public static void displayPrice() {
        System.out.println("Price: " + price);
    }

    public static String displayMaterial(String material) {
        System.out.println("Material: " + material);
        return material;
    }

    static int width = 120;

    public static int displayWidth() {
        System.out.println("Width (cm): " + width);
        return width;
    }
}

