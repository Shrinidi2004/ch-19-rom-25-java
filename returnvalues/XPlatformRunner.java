class XPlatformRunner {

    public static void main(String[] XPlatformRunner) {
        System.out.println("main started");

        boolean registered = XPlatform.registerUser("Tanvi", "tanviX", 9988776655L, "tanvi@xplatform.io", "Xpass786");

        if (registered) {
            System.out.println("User registered successfully.");
            XPlatform.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
