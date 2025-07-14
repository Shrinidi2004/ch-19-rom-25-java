class GamingPC {

	static String processor;
	static String gpu;
	static int ramGB;
	static int storageGB;
	static boolean hasRGBLighting;
	static double price;

	public static String getprocessor(){
		processor = "Intel i9 13900K";
		return processor;
	}
	public static String getgpu(){
		gpu = "NVIDIA RTX 4090";
		return gpu;
	}
	public static int getramGB(){
		ramGB = 64;
		return ramGB;
	}
	public static int getstorageGB(){
		storageGB = 2000;
		return storageGB;
	}
	public static boolean gethasRGBLighting(){
		hasRGBLighting = true;
		return hasRGBLighting;
	}
	public static double getprice(){
		price = 349999.00;
		return price;
	}
}

