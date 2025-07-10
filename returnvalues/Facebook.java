class Facebook {

    static String firstName;
    static String lastName;
    static long phnNumber;
    static String emailId;

    public static boolean registerUser(String fName, String lName, long pNumber, String eId) {
        boolean isUserRegistered = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean phnNumberValid = false;
        boolean emailIdValid = false;

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

        if (firstNameValid && lastNameValid && phnNumberValid && emailIdValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The First Name of the Person Is: " + firstName);
        System.out.println("The Last Name of the Person Is: " + lastName);
        System.out.println("The PhoneNumber and Email-Id Is: " + phnNumber + ", " + emailId);
    }
}
