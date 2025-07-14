class Messenger {

	static String fullName;
	static String emailOrPhone;
	static String newPassword;
	static String confirmPassword;
	static int age;
	static float userRating;
	static long mobileNumber;

	public static boolean isUserCreated(String name, String contact, String pswd, String cpswd, int userAge, float rating, long phone) {
		boolean isAccountCreated = false;
		boolean nameValid = false;
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
			System.out.println("Name is required for Messenger.");
		}

		if (contact != null) {
			emailOrPhone = contact;
			contactValid = true;
		} else {
			System.out.println("Email or phone number is required.");
		}

		if (pswd != null) {
			newPassword = pswd;
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
			System.out.println("Minimum age required is 13.");
		}

		if (rating > 0.0f) {
			userRating = rating;
			ratingValid = true;
		} else {
			System.out.println("Enter a valid rating.");
		}

		if (phone != 0) {
			mobileNumber = phone;
			phoneValid = true;
		} else {
			System.out.println("Enter a valid mobile number.");
		}

		if (nameValid && contactValid && passwordValid && confirmPasswordValid && ageValid && ratingValid && phoneValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}

	public static void getUserAccount() {
		System.out.println("Messenger Name: " + fullName);
		System.out.println("Messenger Contact: " + emailOrPhone);
		System.out.println("Messenger Password: " + newPassword);
		System.out.println("Confirmed Password: " + confirmPassword);
		System.out.println("User Age: " + age);
		System.out.println("User Rating: " + userRating);
		System.out.println("Phone Number: " + mobileNumber);
	}
}


