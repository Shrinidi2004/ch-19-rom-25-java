class Instagram {

    static String firstName;
    static String lastName;
    static long phnNumber;
    static String emailId;
    static String password;

    public static boolean registerUser(String fName, String lName, long pNumber, String eId, String pswd) {
        boolean isUserRegistered = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean phnNumberValid = false;
        boolean emailIdValid = false;
        boolean passwordValid = false;

        if (fName != null) {
            firstName = fName;
            firstNameValid = true;
        }

        if (lName != null) {
            lastName = lName;
            lastNameValid = true;
        }

        if (pNumber != 0 && eId != null) {
            phnNumber = pNumber;
            emailId = eId;
            phnNumberValid = true;
            emailIdValid = true;
        }

        if (pswd != null && pswd.length() >= 6) {
            password = pswd;
            passwordValid = true;
        }

        if (firstNameValid && lastNameValid && phnNumberValid && emailIdValid && passwordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The First Name is: " + firstName);
        System.out.println("The Last Name is: " + lastName);
        System.out.println("The Phone Number and Email ID is: " + phnNumber + ", " + emailId);
        System.out.println("The Password is: " + password);
    }
}
