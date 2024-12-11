public class Test {
    public static int[] orderPizza(int[] orderPlaced,int size) {
        int answer[]=new int[100];
        int count=0;
        for (int i=0;i<=orderPlaced.length-size;i++) {
            boolean flag=false;
            for (int j=i;j<j+size;j++) {
                if (orderPlaced[j]<0){
                    answer[count++]=orderPlaced[j];
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                answer[count++]=0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int order_size=6;
        int orderPlaced[]={-11,-2,19,37,64,-18};
        int size=3;
        int answer[]=orderPizza(orderPlaced, size);
        for (int i=0;i<answer.length;i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
