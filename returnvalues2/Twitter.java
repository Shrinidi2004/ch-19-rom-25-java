class Twitter {

	static String name;
	static String email;
	static String password;
	static String confirmPassword;
	static int age;
	static float tweetRating;
	static long mobileNumber;

	public static boolean isUserCreated(String n, String mail, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean nameValid = false;
		boolean emailValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (n != null) {
			name = n;
			nameValid = true;
		} else {
			System.out.println("Name is required for Twitter.");
		}

		if (mail != null) {
			email = mail;
			emailValid = true;
		} else {
			System.out.println("Email is required.");
		}

		if (pswd != null) {
			password = pswd;
			passwordValid = true;
		} else {
			System.out.println("Password cannot be empty.");
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
			tweetRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Invalid rating value.");
		}

		if (phone != 0) {
			mobileNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Invalid mobile number.");
		}

		if (nameValid && emailValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Twitter Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Tweet Rating: " + tweetRating);
		System.out.println("Mobile Number: " + mobileNumber);
	}
}

