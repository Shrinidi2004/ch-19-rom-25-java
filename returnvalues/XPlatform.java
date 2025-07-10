class XPlatform {

    static String firstName;
    static String userId;
    static long phone;
    static String email;
    static String password;

    public static boolean registerUser(String fName, String uId, long ph, String mail, String pswd) {
        boolean isUserRegistered = false;
        boolean nameValid = false;
        boolean userIdValid = false;
        boolean phoneValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;

        if (fName != null) {
            firstName = fName;
            nameValid = true;
        }

        if (uId != null) {
            userId = uId;
            userIdValid = true;
        }

        if (ph != 0 && mail != null) {
            phone = ph;
            email = mail;
            phoneValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passwordValid = true;
        }

        if (nameValid && userIdValid && phoneValid && emailValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("User ID: " + userId);
        System.out.println("Phone and Email: " + phone + ", " + email);
        System.out.println("Password: " + password);
    }
}
