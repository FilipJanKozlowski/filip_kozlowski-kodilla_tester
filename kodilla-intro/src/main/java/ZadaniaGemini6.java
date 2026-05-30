//Zadanie 6: Mechanizm ponawiania połączenia
//Twój skrypt próbuje pobrać dane, ale serwer odrzuca połączenie. Chcesz, aby program próbował nawiązać połączenie maksymalnie 3 razy, zanim ostatecznie się podda.
//Największą pułapką w pętli while jest nieskończona pętla. Jeśli zapomnisz wewnątrz pętli zmienić wartość zmiennej, która jest sprawdzana w warunku, pętla nigdy się nie zatrzyma! Dlatego musisz pamiętać o ręcznym zwiększeniu licznika prób (np. za pomocą operatora ++).
public class ZadaniaGemini6 {
    public static void main(String[] args) {
        int liczbaProb = 0;
        int maksymalnaLiczbaProb = 3;
        while (liczbaProb < maksymalnaLiczbaProb) {
            liczbaProb++;
            System.out.println("Proba polaczenia numer: " + liczbaProb);
        }
    }
}