class Tourism {
    static String touristPlaces[] = {
        "Mysore Palace,", "Taj Mahal,", "Qutub Minar,", "Charminar,", "India Gate,", 
        "Red Fort,", "Gateway of India,", "Hampi,", "Darjeeling,", "Backwaters of Kerala"
    };

    public static void main(String[] TourismPlaces) {
        System.out.println("Top 10 Tourist Places to Visit in India: " + touristPlaces.length);
        System.out.println(touristPlaces[0] + " " + touristPlaces[1] + " " + touristPlaces[2] + " " + touristPlaces[3] + " " + touristPlaces[4] + " " +
                           touristPlaces[5] + " " + touristPlaces[6] + " " + touristPlaces[7] + " " + touristPlaces[8] + " " + touristPlaces[9]);
    }
}
