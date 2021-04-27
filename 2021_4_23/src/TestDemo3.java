import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/23/20:06
 * @Description:
 */
public class TestDemo3 {
    public static void main(String[] args) {
        //给定两个整型数组, 交换两个数组的内容.
        int[] arr1 = {1,3,4,5,6};
        int[] arr2 = {7,8,9,10,11,12,13,14};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        swap(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public  static void swap(int[] arr1,int[] arr2){
        int len = arr1.length>arr2.length?arr2.length:arr1.length;
        for (int i = 0; i < len; i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
    public static void main1(String[] args) {
        //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
        int[] arr = {1,3,4,5,6,8,56,8,9,423};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left<right){
            while(left<right && array[left]%2==0){
                left++;
            }
            while(left<right && array[right]%2!=0){
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }
}
