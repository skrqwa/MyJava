import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/26/18:06
 * @Description:
 */
public class MyNewArrayList {
    private int[] elem;
    private int usedSize;

   public MyNewArrayList(){
       this.elem = new int[5];
   }
   //判断容量是否满了
    public boolean isFull(){
       if(this.elem.length == this.usedSize){
           return true;
       }
       return false;
    }
// 打印顺序表
   public void display() {
       for (int i = 0; i < this.usedSize; i++) {
           System.out.print(this.elem[i]+" ");
       }

   }
   // 在 pos 位置新增元素
    public void add(int pos, int data) {
       //扩容
        if(this.isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
       if(pos < 0 || pos > this.usedSize){
           System.out.println("位置不合法。");
           return;
       }
        for (int i = this.usedSize-1; i >=pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;

    }
   // 判定是否包含某个元素
     public boolean contains(int toFind) {
         for (int i = 0; i < this.usedSize; i++) {
             if(this.elem[i] == toFind){
                 return true;
             }
         }
       return false;
   }
   // 查找某个元素对应的位置
     public int search(int toFind) {
         for (int i = 0; i < this.usedSize; i++) {
             if(this.elem[i] == toFind){
                 return i;
             }
         }
       return -1;
   }
   // 获取 pos 位置的元素
     public int getPos(int pos) {
       if(pos<0 || pos>usedSize){
           System.out.println("位置不合法。");
           return -1;
       }
       return this.elem[pos];
   }
   // 给 pos 位置的元素设为 value
     public void setPos(int pos, int value) {
       if(pos<0 || pos>this.usedSize){
           System.out.println("位置不合法。");
           return;
       }
       this.elem[pos] = value;
     }
   //删除第一次出现的关键字key
     public void remove(int toRemove) {
       int index = this.search(toRemove);
       if(index == -1){
           System.out.println("该元素不存在");
           return;
       }
         for (int i = index; i < usedSize-1; i++) {
             this.elem[i] = this.elem[i+1];
         }
         this.usedSize--;
     }
   // 获取顺序表长度
     public int size() {
       return usedSize;
   }
   // 清空顺序表
     public void clear() {
       this.usedSize = 0;
     }

    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
