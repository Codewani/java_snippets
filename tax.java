import java.util.Scanner;
public class tax{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your income: ");
		double income = input.nextDouble();
		double first_bracket = 4000, second_bracket = 6800, third_bracket = 8900;
		//percentages of each bracket
		double perc_brack1 = 0.00, perc_brack2 = 0.200, perc_brack3 = 0.300, perc_brack4 = 0.375;
		if(income <= 4000.00){
			double tax = income * perc_brack1;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
		else if(income <= 6800.00){
			double tax = (first_bracket * perc_brack1) + (income - first_bracket) * perc_brack2;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
		else if(income <= 8900){
			double tax = (first_bracket * perc_brack1) + ((second_bracket - first_bracket) * perc_brack2) + (income - second_bracket) * perc_brack3;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
		else{
			double tax = (first_bracket * perc_brack1) + ((second_bracket - first_bracket) * perc_brack2) + ((third_bracket - second_bracket) * perc_brack3) + (income - third_bracket) * perc_brack4;
			double net_salary = income - tax;
			System.out.println("Tax: " + tax + " Net salary: " + net_salary);
		}
	}
}