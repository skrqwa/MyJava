import java.util.Scanner; // 需要导入 util 包

public class Test {
    public static void main(String[] args) {
        //System.out.println("hello");
//        short a = 128;
//        byte b = (byte)a;//-128 - 127 圆圈循环
//        System.out.println(b);
//        System.out.println("\\\"hello\\\"");
//        System.out.println(5/0);
//        System.out.println((float)5/2);
//        System.out.println(5/(float)2);
//        System.out.println((float)(5/2));

//        int a = 10;
//        a +=2;
//        System.out.println(a);
//        short b=6;
//        //b = b+2;//会报错 2默认时int类型
//        b+=2;// b = (short)(b+2);
//        //复合运算符 会自动强制类型转换

//        int a = 0xf;
//        System.out.printf("%x\n",~a);
        //<<左移相当于乘法x2
        //>>右移相当于除/2
        //无符号右移  右边丢弃 左边统一补0
        //System.out.println(-1>>>1);
        //原码 1000 0001
        //反码 1111 1110符号位不变，数值位取反
        //补码 1111 1111反码加1 无符号右移1位 符号位补0  0111 1111
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的姓名：");
//        String name = sc.nextLine();
//        System.out.println("请输入你的年龄：");
//        int age = sc.nextInt();
//        System.out.println("请输入你的工资：");
//        float salary = sc.nextFloat();

//        int a=10;
//        if(a>10){
//            System.out.println("a>10");
//        }
//        else{
//            System.out.println("a=10");
//        }
        int year = 2021;
        if(year % 4==0 && year%100!=0 || year%400==0){
            System.out.println("2021是闰年");
        }
        else{
            System.out.println("2021不是闰年");
        }

    }
}
