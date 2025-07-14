class TikTokRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = TikTok.isUserCreated("funcreator", "user@tiktok.com", 91, "TikTok@123", "TikTok@123", 18, 4.4f, 9888877666L);
		System.out.println("Is TikTok Account Created: " + accountIsCreated);

		if (accountIsCreated) TikTok.getUserAccount();
	}
}