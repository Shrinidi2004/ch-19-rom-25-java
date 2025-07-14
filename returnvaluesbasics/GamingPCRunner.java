class GamingPCRunner {
	public static void main(String[] args){
		System.out.println("Processor: " + GamingPC.getprocessor());
		System.out.println("GPU: " + GamingPC.getgpu());
		System.out.println("RAM (GB): " + GamingPC.getramGB());
		System.out.println("Storage (GB): " + GamingPC.getstorageGB());
		System.out.println("Has RGB Lighting: " + GamingPC.gethasRGBLighting());
		System.out.println("Price: " + GamingPC.getprice());
	}
}
