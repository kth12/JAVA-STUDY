package ConvertingTemp;

public class App {
	public static void main(String[] args) {
	// ¼·¾¾¿Âµµ¸¦ È­¾¾¿Âµµ·Î º¯È¯ (oµµ¾¾ * 9/5) + 32 =32µµF
	
		double c =25; //¼·¾¾ º¯¼ö cÃÊ±â°ªÀ» 25
		double f = (c * 9/5) + 32; //È­¾¾ º¯¼ö´Â f
		
		System.out.println("¼·¾¾ " + c + "´Â È­¾¾ " + f + "ÀÌ´Ù");
	}
}
