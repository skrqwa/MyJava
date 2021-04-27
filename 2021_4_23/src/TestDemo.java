/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/23/10:34
 * @Description:类和对象
 */

class Test{
    public int a ;
    public static int count;

    public static void change(){
        count = 100;
        //a = 100;静态方法里，不可定义普通成员变量，否则会报错
    }
}
class Main{
    public static void main4(String[] args) {
        Test.change();//用类名直接调用静态方法，不用创建实例
        System.out.println(Test.count);

    }
}
class Person{
    public String name;
    public int age;
    public static int count;

    public void eat(){
        System.out.println(age+"的"+name+"就知道吃!");
    }
    public void sleep(){
        System.out.println(age+"的"+name+"就知道睡!");
    }
}
public class TestDemo {
    public static void main3(String[] args) {
        Person.count = 1;
        System.out.println(Person.count);
    }
    public static void main2(String[] args) {
        Person person = new Person();
        person.age++;
        System.out.println(person.age);
        Person.count++;
        System.out.println(person.count);
        System.out.println("===================");
        Person person1 = new Person();
        person1.age++;
        System.out.println(person1.age);
        Person.count++;
        System.out.println(person1.count);
    }
    public static void main1(String[] args) {
        Person person = new Person();
        person.name = "你";
        person.age = 18;
        person.eat();
        person.sleep();
        System.out.println(person.age);
        System.out.println(person.name);
    }

}
