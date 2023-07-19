import java.util.*;

public class SortUniqueElements{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter 10 integers: ");
		for(int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}
		sort(array);
		//System.out.print(Arrays.toString(array));
		removeDuplicates(array);
	}
	
	public static void removeDuplicates(int[] array){
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			int count = 0;
			for(int j = i + 1; j < array.length; j++){
				if(array[i] == array[j])
					count += 1;
			}
			if(count == 0){
				System.out.print(array[i]);
				if(i != array.length - 1)
					System.out.print(", ");
			}
			
 		}
		System.out.print("]");		
	}
	
	public static int[] sort(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - 1; j++){
				if(array[j] > array[j + 1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}