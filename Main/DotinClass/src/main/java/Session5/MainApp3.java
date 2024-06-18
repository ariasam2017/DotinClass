package Session5;

public class MainApp3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(avg(numbers));

    }
    public static int avg(int[] numbers) {  //Average For Loop
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum+=numbers[i];
        }
        int result=sum/numbers.length;
        return result;
    }
}
