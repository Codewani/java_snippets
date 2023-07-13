import java.util.*;
/**
 * program that prompts the user to enter a 3 * 3 matrix of double 
 * values and displays a new row-sorted matrix. Here is a sample run:
 * Enter a 3-by-3 matrix row by row: 
 * 0.15 0.875 0.375
 * 0.55 0.005 0.225
 * 0.30 0.12 0.4
 *
 * The row-sorted array is 
 * 0.15 0.375 0.875
 * 0.005 0.225 0.55 
 * 0.12 0.30 0.4
 */
public class RowSort{
	public static void main(String[] args){
		double[][] myArray = new double[3][3];
		createArray(myArray);
		sortRows(myArray);
		displayMatrix(myArray);
	}

	public static void displayMatrix(double[][] array){
		System.out.println("The row-sorted array is");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(array[i][j] + " ");
			}
		System.out.print("\n");
		}
	}

	public static double[][] sortRows(double[][] array){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < 2; k++){
					if(array[i][k] > array[i][k + 1]){
						double temp = array[i][k];
						array[i][k] = array[i][k + 1];
						array[i][k + 1] = temp;
					}
				}
			}
		}
		return array;			
	}

	public static double[][] createArray(double[][] array){
		System.out.println("Enter a 3-by-3 matrix row by row:");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				array[i][j] = input.nextDouble();
			}
		}
		System.out.print("\n");
		return array;
	}
}