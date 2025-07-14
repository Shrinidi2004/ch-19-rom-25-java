class InstagramThreadsRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = InstagramThreads.isUserCreated("thread_user", "user@threads.com", "Threads@123", "Threads@123", 20, 4.9f, 8123456789L);
		System.out.println("Is Threads Account Created: " + accountIsCreated);
		
		if (accountIsCreated) InstagramThreads.getUserAccount();
	}
}
