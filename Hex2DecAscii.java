import java.util.Scanner;
//A Java Hexadecimal to Decimal Converter that utilizes ASCII conversions
public class Hex2DecAscii{
	public static void main(String[] args){
		System.out.println("Enter a valid hexadecimal value");
		Scanner input = new Scanner(System.in);
		String s = input.next().toUpperCase();
		double x = 0;
		int n = s.length() - 1;
		for(int i = 0; i <= n; i++){
			char hex = s.charAt(i);
			int value = (hex >= '0' && hex <= '9')? (int)(hex) - 48: (int)(hex) - 55;
			x += (value * Math.pow(16, n-i));     
		}
		System.out.println((int)x);
	}
}
