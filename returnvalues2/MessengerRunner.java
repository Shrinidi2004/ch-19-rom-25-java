class MessengerRunner {
	public static void main(String[] args) {
		boolean accountIsCreated = Messenger.isUserCreated(null, "nidhi@messenger.com", "Nidhi@123", "Nidhi@123", 21, 4.6f, 9876543211L);
		System.out.println("Is Messenger Account Created: " + accountIsCreated);
		
		if (accountIsCreated) Messenger.getUserAccount();
	}
}