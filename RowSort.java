import java.util.*;

public class RowSort{
	public static void main(String[] args){
		double[][] myArray = new double[3][3];
		anArray(myArray);
		sortRows(myArray);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(myArray[i][j] + " ");
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

	public static double[][] anArray(double[][] array){
		System.out.println("Enter a 3 x 3 array");
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