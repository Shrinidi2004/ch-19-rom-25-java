class Reddit {

	static String username;
	static String email;
	static String password;
	static String confirmPassword;
	static int userAge;
	static float profileKarma;
	static long mobileNumber;

	public static boolean isUserCreated(String uname, String mail, String pswd, String cpswd, int age, float karma, long phone) {
		boolean isAccountCreated = false;
		boolean usernameValid = false;
		boolean emailValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean userAgeValid = false;
		boolean karmaValid = false;
		boolean mobileNumberValid = false;

		if (uname != null) {
			username = uname;
			usernameValid = true;
		} else {
			System.out.println("Reddit Username is required.");
		}

		if (mail != null) {
			email = mail;
			emailValid = true;
		} else {
			System.out.println("Email is required for Reddit registration.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password cannot be empty.");
		}

		if (cpswd != null && cpswd == pswd {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Passwords do not match.");
		}

		if (age >= 13) {
			userAge = age;
			userAgeValid = true;
		} else {
			System.out.println("Minimum age to join Reddit is 13.");
		}

		if (karma >= 0.0f) {
			profileKarma = karma;
			karmaValid = true;
		} else {
			System.out.println("Invalid karma value.");
		}

		if (phone != 0) {
			mobileNumber = phone;
			mobileNumberValid = true;
		} else {
			System.out.println("Please enter a valid mobile number.");
		}

		if (usernameValid && emailValid && passwordValid && confirmPasswordValid && userAgeValid && karmaValid && mobileNumberValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Reddit Username: " + username);
		System.out.println("Reddit Email: " + email);
		System.out.println("Reddit Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("User Age: " + userAge);
		System.out.println("Reddit Karma: " + profileKarma);
		System.out.println("Mobile Number: " + mobileNumber);
	}
}

