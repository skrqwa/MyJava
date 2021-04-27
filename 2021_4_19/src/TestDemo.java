import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/19/13:46
 * @Description:
 */
public class TestDemo {
    public static String myToString1(int[] array){
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            if(i<array.length-1){
                ret += array[i];
                ret += ",";
            }else {
                ret += array[i];
                ret += "]";
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,3,4,56,7};
        System.out.println(myToString1(array));
    }
    public static int[] mycopyOf(int[] arr){
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
    public static void main11(String[] args) {
        //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
        int[] array = {1,3,5,7};
        int[] copy = mycopyOf(array);
        System.out.println(Arrays.toString(copy));

    }
    public static int binarysearch1(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(array[mid]<key){
                left = mid+1;
            }else if(array[mid]>key){
                right = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main9(String[] args) {
        //给定一个有序整型数组, 实现二分查找
        int[] arr ={1,2,3,5,7,8,67,89};
        System.out.println("要查找的数的下标为："+binarysearch1(arr, 8));

    }
    public static boolean isSorted1(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main8(String[] args) {
        //给定一个整型数组, 判定数组是否有序
        int[] arr = {1,3,5,8,4};
        System.out.println(isSorted1(arr));
    }
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main7(String[] args) {
        int[] arr = {1,3,5,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main6(String[] args) {
        int[] arr = {1,13,4,5};
        System.out.println(isSorted(arr));
    }
    /**
     * @Description: 数组的拷贝
     * @Param:
     * 1.for循环拷贝
     * 2.Array.copyOf
     * 3.System.arraycopy()
     * 4.数组名.clone()  -> 产生当前数组的一个副本
     * 如果以后使用数组的拷贝：有限使用2和3
     * @return:
     * @Author: 你安哥
     * @Date: 2021/4/19
     */
    public static void main5(String[] args) {
        int[] arr = {1,2,3,4,5};

    }
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
             int mid = left + (right-left)/2;
            if(array[mid]<key){
                left = mid+1;
            }else if(array[mid]>key){
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main4(String[] args) {
        int[] arr = {1,5,6,8,5};
        System.out.println(binarySearch(arr, 8));
    }
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static void main3(String[] args) {
        int[] arr = {1,4,5,56,77,44};
        System.out.println(findMax(arr));
    }
    public static String myToString(int[] arr){
        if(arr == null)
            return "null";
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1){
                ret += arr[i];
                ret += ",";
            }else{
                ret += arr[i];
                ret += "]";
            }

        }
        return ret;
    }
    public static void main2(String[] args) {
        int[] arr = {1,3,4};
        System.out.println(myToString(arr));

    }
    public static int[] fun(int[] array){
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i]*2;
        }
        return tmp;
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = fun(arr);
        System.out.println(Arrays.toString(arr1));
    }

}
