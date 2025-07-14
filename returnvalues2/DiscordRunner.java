class DiscordRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Discord.isUserCreated("user@discord.com", "NitroUser", "Disc@123", "Disc@123", 19, 4.7f, 9001122334L);
		System.out.println("Is Discord Account Created: " + accountIsCreated);
		
		if (accountIsCreated) Discord.getUserAccount();
	}
}