class YouTubeMusic {

	static String fullName;
	static String email;
	static int phoneCode;
	static String password;
	static String confirmPassword;
	static int age;
	static float audioRating;
	static long contactNumber;

	public static boolean isUserCreated(String name, String mail, int code, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean nameValid = false;
		boolean emailValid = false;
		boolean contactValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		boolean ageValid = false;
		boolean ratingValid = false;
		boolean phoneValid = false;

		if (name != null) {
			fullName = name;
			nameValid = true;
		} else {
			System.out.println("Full Name is required.");
		}

		if (mail != null || code != 0) {
			email = mail;
			phoneCode = code;
			contactValid = true;

			if (mail != null) {
				emailValid = true;
			}
		} else {
			System.out.println("Either Email or Phone Code must be provided.");
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
			audioRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Please give a valid rating.");
		}

		if (phone > 0) {
			contactNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Valid contact number is required.");
		}

		if (nameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}

		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("YouTubeMusic Full Name: " + fullName);
		System.out.println("Email: " + email);
		System.out.println("Phone Code: " + phoneCode);
		System.out.println("Password: " + password);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("Age: " + age);
		System.out.println("Audio Rating: " + audioRating);
		System.out.println("Contact Number: " + contactNumber);
	}
}


