class InstagramRunner {

    public static void main(String[] InstagramRunner) {
        System.out.println("main started");

        boolean userIsRegistered = Instagram.registerUser(
            "Shrinidhi",
            "Shivananda",
            9380168202L,
            "shrinidi2004@gmail.com",
            "Shri9380@"
        );

        if (userIsRegistered) {
            System.out.println("User registered successfully.");
            Instagram.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
