import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/21/19:57
 * @Description:
 */

class Person{
    //属性/字段/成员变量
    //如果没有初始化 初始值为默认值
    private String name;
    public int age;

    public static int count;
    //静态的成员变量是不依赖对象的

    //成员方法/行为
    public void eat(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(count);
        System.out.println("吃东西。");
    }
    //静态的成员方法 也是不依赖与对象的
    //直接通过类名来访问
    public static void staticFun(){
        //静态的方法内为啥不能访问普通成员变量
        //name age 都是实例化了对象之后 静态方法没有实例化对象
        //System.out.println(name);不能访问非静态成员属性
        //System.out.println(age);
        System.out.println(count);
        System.out.println("静态方法。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
    //构造方法
    public Person(){
        this("jinghuan");//只能使用一个 可以调用带一个参数的构造方法
        System.out.println("不带参数的构造方法。");
    }
    public Person(String name){

        System.out.println("带一个参数的构造方法。");
    }
    public Person(String name,int age){

        System.out.println("带两个参数的构造方法。");
    }
    static {
        //静态代码块只执行一次且最先执行
        System.out.println("静态代码块。");
    }
    {
        System.out.println("实例化代码块或叫构造代码块");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    //实例化一个对象 new
    public static void main(String[] args) {
        Person person = new Person();
    }
    public static void main8(String[] args) {
        //构造方法
        //没有返回值 方法名和类名一样
        //构造方法是用来实例化（初始化）对象的
        Person person = new Person();
        Person person1 = new Person("caocao");
        Person person2 = new Person("caocao",10);

    }
    public static void main7(String[] args) {
        Person person = new Person();
        person.setName("wenan");
        System.out.println(person.getName());
    }
    public static void main6(String[] args) {
        //为什么main函数它是静态的
        //jvm里面会自动调用这个静态函数
    }
    public static void main5(String[] args) {
        Person person = new Person();
        person.eat();
        Person.staticFun();
    }
    public static void main4(String[] args) {
        Person per = null;
        System.out.println(per.count);//不会报错，count不依赖于对象
        //System.out.println(per.name);//会报错 name依赖于对象 会发生空指针异常

    }
    public static void main3(String[] args) {
        Person person = new Person();
        //person.age++;
        System.out.println(person.age);
        Person.count++;
        System.out.println(Person.count);

        Person person1 = new Person();
        person1.age++;
        System.out.println(person1.age);
        Person.count++;
        System.out.println(Person.count);
    }
    public static void main2(String[] args) {
        Person person = new Person();
        //System.out.println(person.name);
        System.out.println("===================");
        //System.out.println(person.count);
        System.out.println(Person.count);//静态变量通过类名访问
    }
    public static void main1(String[] args) {
        Person person = new Person();
        System.out.println(person);
        //person.name = "tanwenan";
        person.age = 23;
        person.eat();
        System.out.println(person);
    }
}
