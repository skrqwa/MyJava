/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/26/19:34
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyNewArrayList myNewArrayList = new MyNewArrayList();
        myNewArrayList.add(0,0);
        myNewArrayList.add(1,1);
        myNewArrayList.add(2,2);
        myNewArrayList.add(3,3);
        myNewArrayList.add(4,4);
        myNewArrayList.add(5,5);
        myNewArrayList.add(6,6);
        myNewArrayList.display();
        System.out.println();
        System.out.println("5的下标是："+myNewArrayList.search(5));
        System.out.println("是否包含6？"+myNewArrayList.contains(6));
        System.out.println("4下标的元素为："+myNewArrayList.getPos(4));
        myNewArrayList.setPos(4,100);
        myNewArrayList.setPos(2,100);
        myNewArrayList.display();
        System.out.println();
        myNewArrayList.remove(100);
        myNewArrayList.display();
        System.out.println();
        System.out.println("链表长度为："+myNewArrayList.size());
        myNewArrayList.clear();
        System.out.println("链表长度为："+myNewArrayList.size());

    }
}
