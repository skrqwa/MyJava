/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/23/19:47
 * @Description:
 */
class Calculater{
    private int num1;
    private int num2;

    public Calculater(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add(){
        this.num1 = num1;
        this.num2 = num2;
        return num2+num1;
    }
    public int sub(){
        this.num1 = num1;
        this.num2 = num2;
        return num1-num2;
    }
    public double dev(){
        this.num1 = num1;
        this.num2 = num2;
        return num1*1.0/num2;
    }
    public int mul(){
        this.num1 = num1;
        this.num2 = num2;
        return num2*num1;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Calculater calculater = new Calculater(40,20);
        System.out.println(calculater.add());
        System.out.println(calculater.sub());
        System.out.println(calculater.mul());
        System.out.println(calculater.dev());
    }
}
