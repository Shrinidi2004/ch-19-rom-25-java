class Tumblr {

	static String email;
	static String username;
	static String password;
	static String confirmPassword;
	static int age;
	static float accountRating;
	static long contactNumber;

	public static boolean isUserCreated(String mail, String uname, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean emailValid = false;
		boolean usernameValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean contactNumberValid = false;

		if (mail != null) {
			email = mail;
			emailValid = true;
		} else {
			System.out.println("Email is required for Tumblr registration.");
		}

		if (uname != null) {
			username = uname;
			usernameValid = true;
		} else {
			System.out.println("Username is required.");
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

		if (userAge >= 18) {
			age = userAge;
			ageValid = true;
		} else {
			System.out.println("You must be at least 18 years old to sign up for Tumblr.");
		}

		if (rating > 0.0f) {
			accountRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Please give a valid rating for your Tumblr experience.");
		}

		if (phone != 0) {
			contactNumber = phone;
			contactNumberValid = true;
		} else {
			System.out.println("Please enter a valid phone number.");
		}

		if (emailValid && usernameValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && contactNumberValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Tumblr Email: " + email);
		System.out.println("Tumblr Username: " + username);
		System.out.println("Tumblr Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("User Age: " + age);
		System.out.println("User Rating: " + accountRating);
		System.out.println("Contact Number: " + contactNumber);
	}
}

