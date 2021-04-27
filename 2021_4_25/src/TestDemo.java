/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/25/18:24
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        //顺序表的对象
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.add(5,6);
        myArrayList.display();
        System.out.println(myArrayList.contains(99));
        System.out.println(myArrayList.search(3));
        myArrayList.setPos(0,88);
        myArrayList.display();

    }

}
