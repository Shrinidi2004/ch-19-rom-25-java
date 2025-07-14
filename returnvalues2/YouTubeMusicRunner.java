class YouTubeMusicRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = YouTubeMusic.isUserCreated("Shrinidhi", "shri@music.com", 91, "YTMusic@123", "YTMusic@123", 20, 4.8f, 9988776655L);
		System.out.println("Is YouTube Music Account Created: " + accountIsCreated);

		if (accountIsCreated) YouTubeMusic.getUserAccount();
	}
}