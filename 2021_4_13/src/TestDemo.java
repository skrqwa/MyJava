import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/13/18:41
 * @Description:数组：就是存放一组相同类型的数据的集合
 * 下标位置是从0开始的
 *
 */

public class TestDemo {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int[] arr = {a,b};
        swap(arr);
        String ret = Arrays.toString(arr);
        System.out.println(ret);
    }
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main3(String[] args) {
        int[] arr = {1,3,4,5};
        System.out.println(arr);
        printarr(arr);
    }
    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main2(String[] args) {
        //遍历数组的方式
        //数组名.length 就可以获取到数组的长度
        int[] arr = {1,3,4,4,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("==============for each===========");

        /**
         * @Description: for each
         * 遍历数组的每一个元素，并赋值给x
         * @Param: [args]
         * @return: void
         * @Author: 你安哥
         * @Date: 2021/4/13
         */
        for (int x:arr) {
            System.out.print(x+" ");
        }
        //3.使用操作数组的工具
        //Arrays:就是操作java数组的工具类
        String ret = Arrays.toString(arr);
        System.out.println();
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        int[] arr = new int[]{1,3,4};
        int[] arr1 = {10,5,45};//使用频率最高
        int[] arr2;//仅仅是定义数组没有初始化,初始化默认是0
        int[] arr3 = new int[10];
        int[] arr4 = new int[]{1,3,2,3,4};//赋值后，不能设置长度
        for (int x:arr1) {
            System.out.println(x);
        }
        for (int x:arr) {
            System.out.println(x);
        }
    }

}
