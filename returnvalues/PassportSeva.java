class PassportSeva {

    static String givenName;
    static String surName;
    static long phnNumber;
    static String emailId;

    public static boolean registerUser(String gName, String sName, long pNumber, String eId) {
        boolean isUserRegistered = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean phnNumberValid = false;
        boolean emailIdValid = false;

        if (gName != null) {
            givenName = gName;
            givenNameValid = true;
        }

        if (sName != null) {
            surName = sName;
            surNameValid = true;
        }

        if (pNumber != 0 && eId != null) {
            phnNumber = pNumber;
            emailId = eId;
            phnNumberValid = true;
            emailIdValid = true;
        }

        if (givenNameValid && surNameValid && phnNumberValid && emailIdValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The Given Name Is: " + givenName);
        System.out.println("The SurName Is: " + surName);
        System.out.println("The PhoneNumber and Email-Id Is: " + phnNumber + ", " + emailId);
    }

}
