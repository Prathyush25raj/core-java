class Door {


    public static void displayDoorType(String type) {
        System.out.println("Door Type: " + type);
    }

    static double price = 7000;

    public static void displayPrice() {
        System.out.println("Price: " + price);
    }

    public static String displayMaterial(String material) {
        System.out.println("Material: " + material);
        return material;
    }

    static int height = 210;

    public static int displayHeight() {
        System.out.println("Height (cm): " + height);
        return height;
    }
}

