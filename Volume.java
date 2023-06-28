public class Volume {
    public static void main(String[] args){
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int temp = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = i + 1; j < height.length; j++){
                if (i != j){
                    int width;
                    int _height;

                    if (i + 1 > j + 1)
                        width = ((i + 1) - (j + 1));
                    else 
                        width = ((j + 1) - (i + 1));

                    if (height[i] < height[j])
                        _height = height[i];
                    else 
                        _height = height[j];

                    int volume = width*_height;
                    if (volume > temp)
                        temp = volume;  
                }
            }
        }
        System.out.println(temp);
    }
}
