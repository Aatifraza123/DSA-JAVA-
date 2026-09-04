import java.util.Arrays;

public class LinearSearchIn2d {
    static int[] linearIn2d(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {{1,5,3,6,7,},
                {4,6,2,1,7,},
                {8,3,1,8,4}};
        int target = 8;
        System.out.println(Arrays.toString(linearIn2d(arr,target)));
    }
}
