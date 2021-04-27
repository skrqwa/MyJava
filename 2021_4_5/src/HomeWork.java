import java.util.Scanner;

public class HomeWork {
    public static void main1(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int i = 0;
        int len=0;
        for(i=1;i<=100;i++){
            if(i%10==9)
            {
               len++;
            }
            if(i/10==9){
                len++;
            }
        }
        System.out.println(len);
    }

    public static void main2(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        int i=0;
        for(i=1000;i<=2000;i++)
        {
            if(i%4==0&&i%100!=0 ||i%400==0){
                System.out.printf("%d\n",i);
            }

        }
    }

    public static void main3(String[] args) {
        //打印 1 - 100 之间所有的素数
        int i=0;

        for(i=1;i<=100;i++){
            int flag=1;
            int j=0;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=0;
                }
            }
            if(flag==1&& i!=1){
                System.out.println(i);

            }
        }
    }

    public static void main5(String[] args) {
        System.out.println("请输入一个数字:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(isPrime(number)){
            System.out.println("这是一个素数\n");
        }else{
            System.out.println("这不是素数\n");
        }

    }
    public static boolean isPrime(int n){

        if(n<=2){
            return false;
        }
        int i=0;
        for(i=2;i<n/2;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        System.out.println("请输入你的年龄：");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age<18){
            System.out.println("你是少年\n");
        }
        else if(age>=18&&age<=28){
            System.out.println("你是青年人\n");
        }
        else if(age>=29&&age<=55){
            System.out.println("你是中年人\n");
        }
        else{
            System.out.println("你是老年人\n");
        }
    }
}
