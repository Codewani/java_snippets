import java.util.Scanner;
public class tax{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your income: ");
		double income = input.nextDouble();
		if(income <= 4000.00){
			double tax = income * 0.000;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
		else if(income <= 6800.00){
			double tax = (4000 * 0.000) + (income - 4000) * 0.200;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
		else if(income <= 8900){
			double tax = (6800 * 0.200) + (income - 6800) * 0.300;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
		else{
			double tax = (8900 * 0.300) + (income - 8900) * 0.375;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
	}
}