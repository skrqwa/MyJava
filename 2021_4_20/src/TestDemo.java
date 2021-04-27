import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/20/10:22
 * @Description:
 */
public class TestDemo {
    public static void arrprint2(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] arr1 = {{1,2,3},{2,3,4},{2,3,6}};
        System.out.println(Arrays.deepToString(arr));
        arrprint2(arr);
        arrprint2(arr1);


    }
    public static void main2(String[] args) {
        int[] arr = {1,3,4,5,6};
        System.out.println(Arrays.binarySearch(arr, 5));
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(flag == false){
                break;//结束循环
            }
        }
    }
    public static void main1(String[] args) {
        int[] arr = {1,3,45,6,7,9,89};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
