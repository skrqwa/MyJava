import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(fac(5));

    }
    public static int fac(int n){
        if(n==1){
            return 1;
        }else{
            return n*fac(n-1);
        }

    }
    public static void main7(String[] args) {
        System.out.println(nSum(10));
    }
    public static int nSum(int n){
        if(n==1){
            return 1;
        }else{
            return n+nSum(n-1);
        }
    }
    public static void main6(String[] args) {
        print(1234);
    }
    public static void print(int n){
        if(n<10){
            System.out.printf("%d ",n%10);
        }else {
            print(n/10);
            System.out.printf("%d ",n%10);

        }
    }
    public static void main5(String[] args) {
        System.out.println(returnSum(456));
    }
    public static int returnSum(int n){
        if(n<10){
            return n%10;
        }else{
            return n%10+returnSum(n/10);
        }
    }
    public static void main4(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n){
        /**
         * @Description: 裴波那契数
         * @Param: [n]
         * @return: int
         * @Author: 你安哥
         * @Date: 2021/4/11
         */
        if(n<=2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    static  int m = 0;
    public static void main3(String[] args) {
        int m = 0;
        char a ='A';
        char b ='B';
        char c ='C';
        hanoi(4,a,b,c);

    }
    public static void hanoi(int n,char a,char b,char c){
        /**
         * @Description: 汉诺塔问题
         * @Param: [n, a, b, c]
         * @return: void
         * @Author: 你安哥
         * @Date: 2021/4/11
         */
        if(n==1){
            move(a,c);
        }else{
            hanoi(n-1,a,c,b);
            move(a,c);
            hanoi(n-1,b,a,c);
        }
    }
    public static void move(char a,char b){
        m++;
        System.out.println("第"+m+"次："+a +"->"+b);
    }

    public static int jumpFloor(int n){
        /**
         * @Description: 青蛙跳台阶问题 
         * @Param: [n]
         * @return: int
         * @Author: 你安哥
         * @Date: 2021/4/11
         */
        if(n==1 || n==2){
            return n;
        }else{
            return jumpFloor(n-1)+jumpFloor(n-2);
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入台阶数：");
        int n = sc.nextInt();
        System.out.println(jumpFloor(n));
        

    }
    public static int sum(int ... array){
        int ret = 0;
        for(int x:array){
            ret +=x;
        }
        return ret;
    }
    public static void main1(String[] args) {
        System.out.println(sum(1, 2, 5, 7));
    }
}
