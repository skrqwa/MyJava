import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(max2(4,6));
        System.out.println(max3(4,8,7));
    }
    public static int max3(int a,int b,int c){
        int e=max2(a,b);
        return e>c?e:c;
    }
    public static int max2(int a,int b){
        return a>b?a:b;
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = sc.nextInt();
        System.out.println(n+"的前"+n+"项阶乘和为："+facSum(n));

    }
    public static int facSum(int n){
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += fac(i);
        }
        return sum;
    }
    public static int fac(int n){
        int ret = 1;
        for (int i = 1; i <= n ; i++) {
            ret *=i;
        }
        return ret;
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = sc.nextInt();
        System.out.println(Fib(n));

    }
    public static int Fib(int n){
        if(n<=2){
            return 1;
        }else{
            return Fib(n-1)+Fib(n-2);
        }
    }
    public static void main2(String[] args) {
        int[] num = new int[]{1,2,3,4,1,2,3};
        System.out.println(findNumber(num));
        
    }
    public static int findNumber(int[] num){
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            n ^= num[i];
        }
        return n;
    }
    public static void main1(String[] args) {
        int n = -1;
        int count =0;
        while(n!= 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}
