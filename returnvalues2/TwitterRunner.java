class TwitterRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Twitter.isUserCreated("Shrinidhi", "shri@twitter.com", "Tweet@123", "Tweet@123", 22, 4.3f, 9198765432L);
		System.out.println("Is Twitter Account Created: " + accountIsCreated);
		
		if (accountIsCreated) Twitter.getUserAccount();
	}
}
