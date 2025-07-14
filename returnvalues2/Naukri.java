class Naukri {

	static String fullName;
	static String emailID;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int yearsOfExperience;
	static float profileStrength;
	static long mobileNumber;

	public static boolean isUserCreated(String name, String email, int code, String pswd, String cpswd, int exp, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean emailIDValid = false;
		boolean nameValid = false;
		boolean contactValid = false;
		boolean pswdValid = false;
		boolean cpswdValid = false;
		boolean expValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (name != null) {
			fullName = name;
			nameValid = true;
		} else {
			System.out.println("Full Name is required.");
		}

		if (email != null || code != 0) {
			emailID = email;
			phoneCode = code;
			contactValid = true;
		} else {
			System.out.println("Either Email or Phone Code must be provided.");
		}

		if (pswd != null) {
			password = pswd;
			pswdValid = true;
		} else {
			System.out.println("Password cannot be empty.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			cpswdValid = true;
		} else {
			System.out.println("Passwords do not match.");
		}

		if (exp >= 0) {
			yearsOfExperience = exp;
			expValid = true;
		} else {
			System.out.println("Experience must be non-negative.");
		}

		if (rating > 0.0f) {
			profileStrength = rating;
			ratingValid = true;
		} else {
			System.out.println("Enter a valid rating.");
		}

		if (phone != 0) {
			mobileNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Invalid mobile number.");
		}

		if (nameValid && emailIDValid && contactValid && pswdValid && cpswdValid && expValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Naukri Full Name: " + fullName);
		System.out.println("Email ID: " + emailID);
		System.out.println("Phone Code (if used): " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Experience (Years): " + yearsOfExperience);
		System.out.println("Profile Strength Rating: " + profileStrength);
		System.out.println("Mobile Number: " + mobileNumber);
	}
}


