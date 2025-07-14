class RedditRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Reddit.isUserCreated("RedditorX", "user@redditmail.com", "RedditX@2025", "RedditX@2025", 19, 20.0f, 9123456789L);
		System.out.println("Is Reddit Account Created: " + accountIsCreated);
		
		if (accountIsCreated) Reddit.getUserAccount();
	}
}
