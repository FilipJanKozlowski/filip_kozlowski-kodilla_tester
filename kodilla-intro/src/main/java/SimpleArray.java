public class SimpleArray {
    public static void main(String[] args) {
        String[] pigsNames = new String[5];
                pigsNames[0] = "Robin";
                pigsNames[1] = "Nami";
                pigsNames[2] = "Tofinka";
                pigsNames[3] = "Grace";
                pigsNames[4] = "Millie";
        String pigName = pigsNames[3];
            System.out.println(pigName);
        int numberOfElements = pigsNames.length;
            System.out.println("Moja tablica zawiera " + numberOfElements + " elementow.");
    }
}