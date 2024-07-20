package args;

public class ArgsDemo02 {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,3,3));
    }
    public static int getSum(int...args){
        int sum = 0;
        for (int i:args) {
            sum = sum +i;
        }
        return sum;
    }
}
