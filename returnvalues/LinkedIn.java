class LinkedIn {

    static String firstName;
    static String lastName;
    static long contactNumber;
    static String emailId;
    static String password;

    public static boolean registerUser(String fName, String lName, long phone, String email, String pswd) {
        boolean isUserRegistered = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean contactValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;

        if (fName != null) {
            firstName = fName;
            firstNameValid = true;
        }

        if (lName != null) {
            lastName = lName;
            lastNameValid = true;
        }

        if (phone != 0 && email != null) {
            contactNumber = phone;
            emailId = email;
            contactValid = true;
            emailValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passwordValid = true;
        }

        if (firstNameValid && lastNameValid && contactValid && emailValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Contact and Email: " + contactNumber + ", " + emailId);
        System.out.println("Password: " + password);
    }
}
