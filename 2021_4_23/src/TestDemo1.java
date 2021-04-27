/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/23/15:16
 * @Description:
 */
class Person1{
    private String name;
    private int age;
    public Person1(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void show() {
        System.out.println("name:"+name+" " + "age:"+age);
    }

}
public class TestDemo1 {
    public static void main(String[] args) {
        new Person1("caocao",19).show();//通过匿名对象调用方法
    }
}
