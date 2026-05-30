//Zadanie 3: Kategoryzacja operacji bankowych
//Masz do dyspozycji tablicę z kwotami z jednego dnia roboczego. Twoim zadaniem jest napisanie kodu, który sprawdzi każdą kwotę w tablicy po kolei i na podstawie jej wartości wypisze odpowiedni komunikat.
//Oto zasady:
//Jeśli kwota jest większa od zera, wypisz: "Wpłata na kwotę: " + kwoty[i]
//Jeśli kwota jest mniejsza od zera, wypisz: "Wypłata na kwotę: " + kwoty[i]
//Jeśli kwota wynosi dokładnie zero (co w systemie może oznaczać błąd lub anulowaną transakcję), wypisz: "Transakcja pusta - do weryfikacji"
public class ZadaniaGemini3 {
    public static void main(String[] args) {
        int[] kwoty = {250, -100, 0, 1500, -20};
        for (int i = 0; i < kwoty.length; i++) {
            if (kwoty[i] > 0) {
                System.out.println("Wplata na kwote: " + kwoty[i]);
            } else if (kwoty[i] < 0) {
                System.out.println("Wyplata na kwote: " + kwoty[i]);
            } else {
                System.out.println("Transakcja pusta - do weryfikacji.");
            }
        }
    }
}