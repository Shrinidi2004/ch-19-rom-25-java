class TelegramRunner{
	public static void main (String [] Tgram){
		boolean accountIsCreated = Telegram.isUserCreated("Shrinidhi","Inamadara",9380168202l,23,4.8f,"Shri9380@","Shri9380@");
		System.out.println("Is Account Created: "+accountIsCreated);
		
		if(accountIsCreated)Telegram.getUserAccount();
	}

}