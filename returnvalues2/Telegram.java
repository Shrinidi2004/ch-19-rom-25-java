class Telegram{

	static String firstName;
	static String lastName;
	static long phoneNumber;
	static int personAge;
	static float rating;
	static String password;
	static String confirmPassword;
	
	public static boolean isUserCreated(String fName, String lName, long pNum, int pAge, float rate, String pswd, String cpswd){
		boolean isAccountCreated = false;
		boolean firstNameValid = false;
		boolean lastNameValid = false;
		boolean phoneNumberValid = false;
		boolean personAgeValid = false;
		boolean ratingValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		
		if (fName != null){
			firstName = fName;
			firstNameValid = true;
		}else{
			System.out.println("Entered First Name is Not Validate......!");
		}
		if(lName != null){
			lastName = lName;
			lastNameValid = true;
		}else{
			System.out.println("Entered Last Name is Not Validate......!");
		}
		if(pNum != 0){
			phoneNumber = pNum;
			phoneNumberValid = true;
		}else{
			System.out.println("Enter a Valid Phone Number......!");
		}
		if(pAge > 18){
			personAge = pAge;
			personAgeValid = true;
		}else{
			System.out.println("Please Enter a Valid Age ......!");
		}
		if(rate > 0.0f){
			rating = rate;
			ratingValid = true;
		}else{
			System.out.println("Please Give a Valid Rating......!");
		}
		if(pswd != null){
			password = pswd;
			passwordValid = true;
		}else{
			System.out.println("Given Password is not Valid.....!");
		}
		if(cpswd != null && cpswd == pswd){
			confirmPassword = cpswd;
			confirmPasswordValid = true;
		}else{
			System.out.println("The Password id Incorrect......!");
		}
		if(firstNameValid && lastNameValid && phoneNumberValid && personAgeValid && ratingValid&& passwordValid && confirmPasswordValid) {
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
	public static void getUserAccount(){
		System.out.println("The First Name of the User: "+firstName);
		System.out.println("The Last Name of the User: "+lastName);
		System.out.println("The Phone Number of the User: "+phoneNumber);
		System.out.println("The First Age of the User: "+personAge);
		System.out.println("The First Rating Gave by the User: "+rating);
		System.out.println("The First Password of the User Account: "+password);
		System.out.println("The First Confirmed Password of the User Account: "+confirmPassword);
		
	}
}

