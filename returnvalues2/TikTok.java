class TikTok {

	static String username;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float creatorRating;
	static long mobile;

	public static boolean isUserCreated(String uname, String mail, int code, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean usernameValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (uname != null) {
			username = uname;
			usernameValid = true;
		} else {
			System.out.println("Username is required.");
		}

		if (mail != null || code != 0) {
			email = mail;
			phoneCode = code;
			contactValid = true;

			if (mail != null) {
				emailValid = true;
			}
		} else {
			System.out.println("Email or Phone Code is required.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password is required.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		} else {
			System.out.println("Passwords do not match.");
		}

		if (userAge >= 13) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("Minimum age is 13.");
		}

		if (rating > 0.0f) {
			creatorRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Please provide a valid rating.");
		}

		if (phone > 0) {
			mobile = phone;
			phoneValid = true;
		} else {
			System.out.println("Mobile number is required.");
		}

		if (usernameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}

		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("TikTok Username: " + username);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Creator Rating: " + creatorRating);
		System.out.println("Mobile: " + mobile);
	}
}


