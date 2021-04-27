import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%-3d  ",i,j,i*j);
            }
            System.out.println();
        }
    }
    public static void print(int n){
        if(n>9){
            print(n/10);
            System.out.printf("%d ",n%10);
        }else {
            System.out.printf("%d ",n);
        }
    }
    public static void main9(String[] args) {
        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num = sc.nextInt();
        print(num);
    }
    public static void main8(String[] args) {
        //编写代码模拟三次密码输入的场景。
        // 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。
        // 三次均错，则提示退出程序
        int num = 123456;
        int count =0;
        System.out.println("请输入6位数字密码：");
        Scanner sc = new Scanner(System.in);
        while (count<3){
            int input = sc.nextInt();
            if(input==num){
                System.out.println("密码正确。");
                break;
            }else{
                if(count==2){
                    System.out.println("密码错误，次数用完，将退出登录界面。");
                }else {
                    System.out.println("密码错误，请重新输入:");
                }
                count++;
            }
        }
    }
    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int tmp = 0;
        System.out.println("奇数位为：");
        for (int i = 30; i >= 0 ; i=i-2) {
            tmp = (num >> i)& 1;
            System.out.print(tmp);
        }
        System.out.println();
        System.out.println("偶数位为：");
        for(int i = 31;i >=1;i = i-2){
            tmp = (num>>i) & 1;
            System.out.print(tmp);
        }
    }
    public static void main6(String[] args) {
        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
        //1的二进制为00000000 0000000 00000000 00000001
        //整数与1按位与n&1若最后一位二进制为1 则结果为1
        //然后n>>1
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);

    }
    public static void main5(String[] args) {
        //求两个正整数的最大公约数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        int c = a>b?b:a;
        while(true){
            if(a%c==0&&b%c==0)
            {
                System.out.println("最大公约数为：");
                System.out.println(c);
                break;
            }else{
                c--;
            }
        }

    }
    public static void main4(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
        double sum = 0;
        double i = 1;
        int flag = 1;
        for ( i = 1; i <= 100 ; i++) {
            sum += flag*(1/i);
            flag = -flag;
        }
        System.out.println(sum);
    }
    public static void main3(String[] args) {
        //求出0～999之间的所有“水仙花数”并输出。
        // (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
        for (int i = 100; i < 999 ; i++) {
            int ind = i % 10;
            int ten = i /10 %10;
            int han = i / 100;
            if(i==ind*ind*ind+ten*ten*ten+han*han*han){
                System.out.println(i);
            }
        }
    }
    public static void main2(String[] args) {
        Random random = new Random();
        int toGuess = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("请猜猜我心里想的一个数：");
        while(sc.hasNextInt()){
            int guess = sc.nextInt();
            if(guess<toGuess){
                System.out.println("猜小了。");
            }else if(guess>toGuess){
                System.out.println("猜大了。");
            }else {
                System.out.println("猜对了。");
                break;
            }
        }

    }

        public static void main1(String[] args){
            Scanner input = new Scanner(System.in);
            while(input.hasNextInt()){
                int n = input.nextInt();
                for (int i = 1; i <=n ; i++) {
                    for (int j = 1; j <=n ; j++) {
                        if(j==i||j==n-i+1){
                            System.out.print("*");
                    }else{
                            System.out.print(" ");
                        }
                }
                    System.out.printf("\n");

            }
        }
    }

}
