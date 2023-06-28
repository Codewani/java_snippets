import java.util.Scanner;

public class Hex2Dec{
	public static void main(String[] args){
		System.out.println("Enter a valid hexadecimal value");
		Scanner input = new Scanner(System.in);
		String s = input.next().toLowerCase();
		int a = 10, b = 11, c = 12, d = 13, e = 14, f = 15;
		double x = 0;
		int n = s.length() - 1;
		for(int i = 0; i <= n; i++){
			char hex = s.charAt(i);
			switch(hex){
				case 'a': x = x + (a * Math.pow(16, n - i)); break;
				case 'b': x = x + (b * Math.pow(16, n - i)); break;
				case 'c': x = x + (c * Math.pow(16, n - i)); break;
				case 'd': x = x + (d * Math.pow(16, n - i)); break;
				case 'e': x = x + (e * Math.pow(16, n - i)); break;
				case 'f': x = x + (f * Math.pow(16, n - i)); break;
				default:
					String p = "" + hex;
					int z = Integer.parseInt(p);
					x = x + (z * Math.pow(16, n-i));
			}
		}
		System.out.println(x);
	}
}		