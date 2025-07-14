class Discord {

	static String email;
	static String username;
	static String password;
	static String confirmPassword;
	static int userAge;
	static float experienceRating;
	static long contactNumber;

	public static boolean isUserCreated(String mail, String uname, String pswd, String cpswd, int age, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean emailValid = false;
		boolean usernameValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean userAgeValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (mail != null) {
			email = mail;
			emailValid = true;
		} else {
			System.out.println("Discord Email is required.");
		}

		if (uname != null) {
			username = uname;
			usernameValid = true;
		} else {
			System.out.println("Discord Username is required.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password cannot be blank.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Passwords do not match.");
		}

		if (age >= 13) {
			userAge = age;
			userAgeValid = true;
		} else {
			System.out.println("Minimum age is 13.");
		}

		if (rating > 0.0f) {
			experienceRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Please enter a valid rating.");
		}

		if (phone != 0) {
			contactNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Contact number is invalid.");
		}

		if (emailValid && usernameValid && passwordValid && confirmPasswordValid && userAgeValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Discord Email: " + email);
		System.out.println("Discord Username: " + username);
		System.out.println("Discord Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("User Age: " + userAge);
		System.out.println("Experience Rating: " + experienceRating);
		System.out.println("Contact Number: " + contactNumber);
	}
}


