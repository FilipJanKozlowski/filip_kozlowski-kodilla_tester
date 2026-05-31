import java.util.Random;

public class RandomNumbers {
    private int theSmallestNumber = 31;
    private int theBiggestNumber = 0;

    public void generateNumbers() {
        int sum = 0;
        Random random = new Random();
        while (sum <= 5000) {
            int randomNumber = random.nextInt(31);
            sum = sum + randomNumber;
            if (randomNumber > theBiggestNumber) {
                theBiggestNumber = randomNumber;
            }
            if (randomNumber < theSmallestNumber) {
                theSmallestNumber = randomNumber;
            }
        }
    }
    public int getTheSmallestNumber() {return this.theSmallestNumber;}
    public int getTheBiggestNumber() {return this.theBiggestNumber;}
    public static void main(String[] args) {
        RandomNumbers runner = new RandomNumbers();
        runner.generateNumbers();
        System.out.println("Najmniejsza wylosowana liczba to: " + runner.getTheSmallestNumber());
        System.out.println("Najwieksza wylosowana liczba to: " + runner.getTheBiggestNumber());
    }
}
