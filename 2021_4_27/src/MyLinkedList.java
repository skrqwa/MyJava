/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/27/19:21
 * @Description:
 * java 集合中 是双向链表 这里只写单向
 */

class ListNode{
    public int val;//值
    public ListNode next;//存储下一个节点的地址  也就是说这是一个引用


    public ListNode(){

    }
    public ListNode(int val){
        this.val = val;
    }
}
public class MyLinkedList {

    public ListNode head;
/*    public void creatList(){
       ListNode listNode1 = new ListNode(12);//val=0 next = null
       ListNode listNode2 = new ListNode(45);
       ListNode listNode3 = new ListNode(6);
       ListNode listNode4 = new ListNode(5);
       ListNode listNode5 = new ListNode(5);
       listNode1.next = listNode2;
       listNode2.next = listNode3;
       listNode3.next = listNode4;
       listNode4.next = listNode5;
       this.head = listNode1;
   }*/
    public void display(){

        ListNode cur = this.head;
       while(cur != null){
           System.out.print(cur.val+" ");
           cur = cur.next;
       }
    }
    // 1、无头单向非循环链表实现

        //头插法
        public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = this.head;
        this.head = node;
        };
        //尾插法
        public void addLast(int data){
            ListNode node = new ListNode(data);
            ListNode cur = this.head;
            if(this.head == null){
                this.head = node;
            }else {
                while(cur.next != null){
                    cur = cur.next;
                }
                cur.next = node;
            }

        }
    public ListNode findIndexSubOne(int index) {
        ListNode cur = this.head;
       /* for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }*/
        int count = 0;
        while(count != index-1){
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data){
            ListNode node = new ListNode(data);
            ListNode cur = this.head;
            if(index == 0){
                addFirst(data);
                return;
            }
            if(index == this.size()){
                addLast(data);
                return;
            }
            if(index <0 || index > this.size()){
                System.out.println("位置不合法。");
                return;
            }
            cur = findIndexSubOne(index);
            node.next = cur.next;
            cur.next = node;

        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key){
            ListNode cur = this.head;
            /*for (int i = 0; i < this.size(); i++) {
                if(key == cur.val){
                    return true;
                }
                cur = cur.next;
            }*/
            while (cur != null){
                if(key == cur.val){
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key){

        }
        //删除所有值为key的节点
        public void removeAllKey(int key){

        }
        //得到单链表的长度
        public int size(){
            int count = 0;
            ListNode cur = this.head;
            while(cur != null){
                count++;
                cur = cur.next;
            }
            return count;
        }

        public void clear(){
            ListNode cur = this.head;//cur 当前需要置空的节点
            //挨个置空
            while(cur != null){
                ListNode curNext = cur.next;
                cur = null;
                cur = curNext;
            }
            this.head = null;
        }

}
