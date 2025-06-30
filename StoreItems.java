class StoreItems {
    static String perfumes[] = {
        "Fogg,", "Denver,", "Park Avenue,", "Wild Stone,", "Nivea,", 
        "AXE Signature,", "Engage,", "Set Wet,", "Bella Vita,", "Skinn by Titan"
    };

    static String groceries[] = {
        "Rice,", "Wheat Flour,", "Sugar,", "Salt,", "Tur Dal,", 
        "Cooking Oil,", "Tea Powder,", "Coffee,", "Biscuits,", "Detergent"
    };

    static String cosmetics[] = {
        "Lipstick,", "Foundation,", "Eyeliner,", "Compact Powder,", "Face Wash,", 
        "Moisturizer,", "Nail Polish,", "Kajal,", "Face Cream,", "Sunscreen"
    };

    public static void main(String[] StoreItems) {
        System.out.println("Top 10 Perfumes Available in Store: " + perfumes.length);
        System.out.println(perfumes[0] + " " + perfumes[1] + " " + perfumes[2] + " " + perfumes[3] + " " + perfumes[4] + " " +
                           perfumes[5] + " " + perfumes[6] + " " + perfumes[7] + " " + perfumes[8] + " " + perfumes[9]);

        System.out.println("Top 10 Grocery Items in Store: " + groceries.length);
        System.out.println(groceries[0] + " " + groceries[1] + " " + groceries[2] + " " + groceries[3] + " " + groceries[4] + " " +
                           groceries[5] + " " + groceries[6] + " " + groceries[7] + " " + groceries[8] + " " + groceries[9]);

        System.out.println("Top 10 Cosmetics in Store: " + cosmetics.length);
        System.out.println(cosmetics[0] + " " + cosmetics[1] + " " + cosmetics[2] + " " + cosmetics[3] + " " + cosmetics[4] + " " +
                           cosmetics[5] + " " + cosmetics[6] + " " + cosmetics[7] + " " + cosmetics[8] + " " + cosmetics[9]);
    }
}
