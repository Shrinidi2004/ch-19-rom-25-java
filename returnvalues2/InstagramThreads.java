class InstagramThreads {

	static String username;
	static String email;
	static String password;
	static String confirmPassword;
	static int age;
	static float profileRating;
	static long phone;

	public static boolean isUserCreated(String uname, String mail, String pswd, String cpswd, int userAge, float rating, long phoneNumber) {
		boolean isAccountCreated = false;
		boolean unameValid = false;
		boolean mailValid = false;
		boolean pswdValid = false;
		boolean cpswdValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (uname != null) {
			username = uname;
			unameValid = true;
		} else {
			System.out.println("Username is required.");
		}

		if (mail != null) {
			email = mail;
			mailValid = true;
		} else {
			System.out.println("Email is required.");
		}

		if (pswd != null) {
			password = pswd;
			pswdValid = true;
		} else {
			System.out.println("Password is required.");
		}

		if (cpswd != null && cpswd == pswd) {
			confirmPassword = cpswd;
			cpswdValid = true;
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
			profileRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Enter a valid rating.");
		}

		if (phoneNumber != 0) {
			phone = phoneNumber;
			phoneValid = true;
		} else {
			System.out.println("Phone number invalid.");
		}

		if (unameValid && mailValid && pswdValid && cpswdValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Threads Username: " + username);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Rating: " + profileRating);
		System.out.println("Phone: " + phone);
	}
}

