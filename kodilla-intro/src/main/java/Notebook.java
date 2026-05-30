public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 && this.weight <= 1800) {
            System.out.println("The notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkTierAndSeries() {
        if (this.price < 800 && this.year < 2020) {
            System.out.println("This is a low-end laptop from the 4 series.");
        } else if (this.price < 800 && this.year >= 2020 && this.year <= 2025) {
            System.out.println("This is a low-end laptop from the 5 series.");
        } else if (this.price < 800 && this.year > 2025) {
            System.out.println("This is a low-end laptop from the 6 series.");
        } else if (this.price >= 800 && this.price <= 1400 && this.year < 2020) {
            System.out.println("This is a mid-end laptop from the 4 series.");
        } else if (this.price >= 800 && this.price <= 1400 && this.year >= 2020 && this.year <= 2025) {
            System.out.println("This is a mid-end laptop from the 5 series.");
        } else if (this.price >= 800 && this.price <= 1400 && this.year > 2025) {
            System.out.println("This is a mid-end laptop from the 6 series.");
        } else if (this.price > 1400 && this.year < 2020) {
            System.out.println("This is a high-end laptop from the 4 series.");
        } else if (this.price > 1400 && this.year >= 2020 && this.year <= 2025) {
            System.out.println("This is a high-end laptop from the 5 series.");
        } else if (this.price > 1400 && this.year > 2025) {
            System.out.println("This is a high-end laptop from the 6 series.");
        }
    }
}