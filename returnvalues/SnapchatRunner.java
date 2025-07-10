class SnapchatRunner {

    public static void main(String[] SnapchatRunner) {
        System.out.println("main started");

        boolean isRegistered = Snapchat.registerUser("snap_aishu", "Aishwarya", 9123456789L, "aishu@snap.com", "Snap2025");

        if (isRegistered) {
            System.out.println("User registered successfully.");
            Snapchat.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
