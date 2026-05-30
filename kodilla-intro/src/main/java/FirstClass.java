public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2022);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkTierAndSeries();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2026);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkTierAndSeries();

        Notebook oldNotebook = new Notebook(1600, 500, 2016);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkTierAndSeries();

        Notebook fastNotebook = new Notebook(1100, 2500, 2024);
        System.out.println(fastNotebook.weight + " " + fastNotebook.price);
        fastNotebook.checkPrice();
        fastNotebook.checkWeight();
        fastNotebook.checkTierAndSeries();

        Notebook simpleNotebook = new Notebook(1700, 750, 2028);
        System.out.println(simpleNotebook.weight + " " + simpleNotebook.price);
        simpleNotebook.checkPrice();
        simpleNotebook.checkWeight();
        simpleNotebook.checkTierAndSeries();

        Notebook mightyNotebook = new Notebook(800, 1350, 2019);
        System.out.println(mightyNotebook.weight + " " + mightyNotebook.price);
        mightyNotebook.checkPrice();
        mightyNotebook.checkWeight();
        mightyNotebook.checkTierAndSeries();
    }
}