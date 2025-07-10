class LinkedInRunner {

    public static void main(String[] LinkedInRunner) {
        System.out.println("main started");

        boolean userRegistered = LinkedIn.registerUser("Vishruth", "K", 9876543210L, "vishruth.k@linkedin.com", "Pass1234");

        if (userRegistered) {
            System.out.println("User registered successfully.");
            LinkedIn.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
