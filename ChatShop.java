class ChatShop {
    static String chats[] = {
        "Pani Puri,", "Masala Puri,", "Sev Puri,", "Bhel Puri,", "Dahi Puri,", 
        "Aloo Tikki Chaat,", "Samosa Chaat,", "Papdi Chaat,", "Ragda Pattice,", "Katori Chaat"
    };

    public static void main(String[] ChatShop) {
        System.out.println("Top 10 Chats Available at the Chat Shop: " + chats.length);
        System.out.println(chats[0] + " " + chats[1] + " " + chats[2] + " " + chats[3] + " " + chats[4] + " " +
                           chats[5] + " " + chats[6] + " " + chats[7] + " " + chats[8] + " " + chats[9]);
    }
}
