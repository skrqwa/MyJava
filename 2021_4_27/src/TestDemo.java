/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/27/18:59
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        //当你在实例化一个ListNode 对象的时候 你能确定哪个值
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addFirst(88);
        myLinkedList.addIndex(2,100);
        System.out.println("88是否在链表中："+myLinkedList.contains(88));
        //myLinkedList.creatList();
        myLinkedList.display();
        System.out.println();
        System.out.println("链表长度为："+myLinkedList.size());
    }
}
