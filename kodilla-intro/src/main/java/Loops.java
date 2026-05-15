public class Loops {
    public int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Loops loops = new Loops();
        int[] myNumbers = {2, 4, 6, 8, 10};
        int result = loops.sum(myNumbers);
        System.out.println("Suma elementow tablicy to: " + result);
    }
}