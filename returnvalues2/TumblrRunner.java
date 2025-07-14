class TumblrRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Tumblr.isUserCreated("user@example.com", "aestheticUser", "Tumblr@123", "Tumblr@123", 20, 4.5f, 9876543210L);
		System.out.println("Is Tumblr Account Created: " + accountIsCreated);
		
		if (accountIsCreated) Tumblr.getUserAccount();
	}
}
