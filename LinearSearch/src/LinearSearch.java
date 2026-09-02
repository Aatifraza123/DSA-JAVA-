import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter an element of Array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();


        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr,target));
    }
}
