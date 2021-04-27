import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 你安哥
 * @Date: 2021/04/25/19:11
 * @Description:
 */
public class MyArrayList {
    //实例成员变量 如果不初始化默认值就是对应的0值
    public int[] elem;//只定义了一个引用
    public int usedSize;//有效的数据个数

    public MyArrayList(){

        this.elem = new int[5];
    }
    public boolean isFull(){
        if (this.elem.length == this.usedSize){
            return true;
        }else{
            return false;
        }
    }
    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
  // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //扩容 this.elem 这个扩容
        if(this.isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //加this是一个良好的编程习惯
        if (pos<0 || pos>this.usedSize){
            System.out.println("pos位置不合法!");
            return;
        }
        for (int i = this.usedSize-1; i >= pos ; i--) {
            this.elem[i] = this.elem[i+1];

        }
        this.elem[pos] = data;
        this.usedSize++;
        /*if(pos>0 || pos<=usedSize){
            int i = usedSize-1;
            while(i>=pos){
                elem[i+1] = elem[i];
                i--;
            }
            elem[pos] = data;
        }
        usedSize++;*/
    }
 // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
  // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
  // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0 || pos>=this.usedSize){
            return -1;
        }
        return this.elem[pos];
    }
  // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        this.elem[pos] = value;
    }
  //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = this.search(toRemove);
        if(index==-1){
            System.out.println("删除元素不存在！");
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

}

