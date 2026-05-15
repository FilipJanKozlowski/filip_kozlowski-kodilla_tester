public class Loops {
    public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] myNumbers = {2, 4, 6, 8, 10};
        int result = sum(myNumbers);
        System.out.println("Suma elementow tablicy to: " + result);
    }
}