//Zadanie 4: Weryfikacja wieku wnioskodawców
//Masz przed sobą tablicę zawierającą wiek klientów, którzy złożyli w systemie wniosek o wydanie nowej karty kredytowej. Twój kod musi sprawdzić wiek każdego z nich i wypisać odpowiedni status wniosku.
//Oto zasady:
//Jeśli klient ma mniej niż 18 lat, wypisz: "Odmowa. Klient niepełnoletni: " + wiekKlientow[i]
//Jeśli klient ma od 18 do 60 lat (włącznie z 18 i 60), wypisz: "Wniosek przyjety do analizy. Wiek: " + wiekKlientow[i] (Podpowiedź: tutaj przyda się operator &&)
//Jeśli klient ma powyżej 60 lat, wypisz: "Wymagane dodatkowe ubezpieczenie. Wiek: " + wiekKlientow[i]
public class ZadaniaGemini4 {
    public static void main(String[] args) {
        int[] wiekKlientow = {16, 24, 65, 18, 45, 12, 60};
        for (int i = 0; i < wiekKlientow.length; i++) {
            if (wiekKlientow[i] < 18) {
                System.out.println("Odmowa. Klient niepelnoletni: " + wiekKlientow[i]);
            } else if (wiekKlientow[i] >= 18 && wiekKlientow[i] <= 60) {
                System.out.println("Wniosek przyjety do analizy. Wiek: " + wiekKlientow[i]);
            } else if (wiekKlientow[i] > 60) {
                System.out.println("Wymagane dodatkowe ubezpieczenie. Wiek: " + wiekKlientow[i]);
            }
        }
    }
}