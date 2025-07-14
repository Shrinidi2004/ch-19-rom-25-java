
class TyreRunner {
	public static void main(String[] args){
		System.out.println("Brand: " + Tyre.getbrand());
		System.out.println("Type: " + Tyre.gettype());
		System.out.println("Diameter (inches): " + Tyre.getdiameterInInches());
		System.out.println("Pressure (PSI): " + Tyre.getpressurePSI());
		System.out.println("Is Tubeless: " + Tyre.getisTubeless());
		System.out.println("Price: " + Tyre.getprice());
	}
}
