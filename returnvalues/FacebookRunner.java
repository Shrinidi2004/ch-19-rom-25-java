class FacebookRunner {

    public static void main(String[] FacebookRunner) {
        System.out.println("main started");

        boolean userIsRegistered = Facebook.registerUser("Shrinidhi Shivananda", "Inamadar", 9380168202L, "shrinidi2004@gmail.com");

        if (userIsRegistered) {
            System.out.println("User registered successfully.");
            Facebook.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
