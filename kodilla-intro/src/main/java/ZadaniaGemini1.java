//Zadanie 1: System weryfikacji
//Otwórz IntelliJ (lub inne środowisko, w którym piszesz) i utwórz nową klasę. Napisz w niej metodę, która będzie symulować prostą weryfikację logowania klienta do systemu. Metoda powinna przyjmować dwa parametry:
//int wprowadzonyPin
//boolean czyKontoZablokowane
//Załóżmy, że poprawny, zapisany w systemie PIN to 1234.
//Twoja metoda powinna zwracać wartość typu String z odpowiednim komunikatem na podstawie poniższych warunków:
//Jeśli wprowadzony PIN jest poprawny i konto nie jest zablokowane, zwróć: "Dostęp przyznany".
//Jeśli konto jest zablokowane (niezależnie od tego, jaki PIN został wprowadzony), zwróć: "Konto zablokowane. Skontaktuj się z bankiem".
//Jeśli PIN jest błędny, ale konto nie jest zablokowane, zwróć: "Błędny PIN".
public class ZadaniaGemini1 {
    public static void main(String[] args) {
        int wprowadzonyPin = 1234;
        boolean czyKontoZablokowane = true;
        int poprawnyPin = 1234;
        if (wprowadzonyPin == poprawnyPin && czyKontoZablokowane == false) {
            System.out.println("Dostep przyznany.");
        } else if (czyKontoZablokowane == true) {
            System.out.println("Konto zablokowane. Skontaktuj sie z bankiem.");
        } else if (wprowadzonyPin != poprawnyPin && czyKontoZablokowane == false) {
            System.out.println("Bledny Pin!");
        }
    }
}