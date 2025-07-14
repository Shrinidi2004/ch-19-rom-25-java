class RadioRunner {
	public static void main(String[] Product){
		
		String radioName = Radio.getradioName();
		System.out.println("The Name of The Radio Brand is: " + radioName);
		
		int volumeCapcity = Radio.getvolumeCapcity();
		System.out.println("The Volume Capacity of The Radio is: " + volumeCapcity);
		
		float favChannelNumber = Radio.getfavChannelNumber();
		System.out.println("The Favorite Channel Number in The Radio is: " + favChannelNumber);
		
		long numberOfChannels = Radio.getnumberOfChannels();
		System.out.println("The Total Number of The Channels Available in Radio is: " + numberOfChannels);
		
		int numberOfButtons = Radio.getnumberOfButtons();
		System.out.println("The Total Number of Buttons Available in Radio is: " + numberOfButtons);
		
		long manufacturerContactNumber = Radio.getmanufacturerContactNumber();
		System.out.println("The Manufacturer Contact Number of the Radio is: " + manufacturerContactNumber);
	}
}
