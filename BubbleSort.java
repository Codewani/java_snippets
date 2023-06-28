import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] a = {9, 5, 7, 8, 6, 4, 5};
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - 1; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
