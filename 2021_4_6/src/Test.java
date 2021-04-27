public class Test {
    public static void main(String[] args) {
        int i = 1;
        int fac = 1;
        int sum = 0;
        for (int num = 1; num <= 5; num++) {
            while(i<=num){
                fac *=i;
                i +=1;
            }
            sum+=fac;
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
       int i = 0;
       int evenSum = 0;
       int oddSum = 0;
        while(i<=100){
            if(i % 2 ==0){
                evenSum +=i;
                i++;
            } else{
                oddSum +=i;
                i++;
            }

       }
        System.out.println("偶数和："+evenSum+",奇数和："+oddSum);
    }
}
