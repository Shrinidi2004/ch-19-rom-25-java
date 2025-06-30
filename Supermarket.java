class Supermarket {
    static String items[] = {
        "Rice,", "Wheat Flour,", "Sugar,", "Milk,", "Toothpaste,", 
        "Shampoo,", "Vegetables,", "Fruits,", "Cooking Oil,", "Snacks"
    };

    public static void main(String[] SupermarketItems) {
        System.out.println("Top 10 Items Available in the Supermarket: " + items.length);
        System.out.println(items[0] + " " + items[1] + " " + items[2] + " " + items[3] + " " + items[4] + " " +
                           items[5] + " " + items[6] + " " + items[7] + " " + items[8] + " " + items[9]);
    }
}
