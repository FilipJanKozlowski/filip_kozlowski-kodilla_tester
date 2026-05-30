public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (this.size == 0) {
            return 0;
        }
        return this.grades[this.size - 1];
    }

    public double getAverage() {
        if (this.size == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + this.grades[i];
        }
        return sum / this.size;
    }

    public static void main(String[] args) {
        Grades myGrades = new Grades();

        myGrades.add(4);
        myGrades.add(5);
        myGrades.add(3);
        myGrades.add(5);
        myGrades.add(5);
        myGrades.add(2);
        myGrades.add(4);
        myGrades.add(4);
        myGrades.add(3);
        myGrades.add(5);

        System.out.println("Ostatnia ocena: " + myGrades.getLastGrade());
        System.out.println("Srednia: " + myGrades.getAverage());
    }
}