class NaukriRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Naukri.isUserCreated("Divya R", null, 91, "Naukri@123", "Naukri@123", 2, 4.6f, 9011223344L);
		System.out.println("Is Naukri Account Created: " + accountIsCreated);

		if (accountIsCreated) Naukri.getUserAccount();
	}
}