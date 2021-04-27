/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/14/17:46
 * @Description:
 */
public class TestDemo {
    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
    }
    public static void main(String[] args) {
        //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
        // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
        int[] arr = {1,2,3};
        transform(arr);
        printArray(arr);
    }
    public static void makearr(int[] arr){
        for (int i = 1; i <=100 ; i++) {
            arr[i-1] = i;
        }
    }
    public static void main3(String[] args) {
        //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] arr = new int[100];
        makearr(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void main2(String[] args) {
        //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
        int[] arr = {1,2,3,4,5};
        printArray(arr);
    }
    public static int sumarr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static void main1(String[] args) {
        //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
      int[] arr = {1,2,6};
        //System.out.println(avg(arr));
        System.out.println(sumarr(arr));
    }
}
