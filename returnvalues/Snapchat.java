class Snapchat {

    static String userName;
    static String displayName;
    static long mobileNumber;
    static String emailId;
    static String password;

    public static boolean registerUser(String uName, String dName, long mobile, String email, String pswd) {
        boolean isUserRegistered = false;
        boolean userNameValid = false;
        boolean displayNameValid = false;
        boolean mobileValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;

        if (uName != null) {
            userName = uName;
            userNameValid = true;
        }

        if (dName != null) {
            displayName = dName;
            displayNameValid = true;
        }

        if (mobile != 0 && email != null) {
            mobileNumber = mobile;
            emailId = email;
            mobileValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passwordValid = true;
        }

        if (userNameValid && displayNameValid && mobileValid && emailValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("User Name: " + userName);
        System.out.println("Display Name: " + displayName);
        System.out.println("Mobile and Email: " + mobileNumber + ", " + emailId);
        System.out.println("Password: " + password);
    }
}
