package Classes.static_members.dollar.util;

public class CurrencyConverter {
	
	public static double price;
	public static double dollar;
	
	public static double Converte(double price,double dollar) {
		
		double iof = price * dollar * 6/100;
		
		return (price * dollar) + iof;
		
	}
	
	
	
	

}
