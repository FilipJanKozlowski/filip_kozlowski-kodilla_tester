//Zadanie 5: System monitorowania opóźnień w spłacie
//Masz przed sobą tablicę, która przechowuje informację o tym, ile dni spóźniają się ze spłatą raty poszczególni klienci. Twój kod musi przejść przez tę tablicę i na podstawie liczby dni opóźnienia, przypisać odpowiednią akcję.
//Oto zasady:
//Jeśli opóźnienie wynosi dokładnie 0 dni, wypisz: "Brak opóźnień. Rata opłacona."
//Jeśli opóźnienie wynosi dokładnie 30 dni LUB dokładnie 60 dni (to są kluczowe momenty w procedurze), wypisz: "Wysyłam oficjalne wezwanie do zapłaty! Dni opóźnienia: " + opoznienia[i]
//Jeśli opóźnienie jest większe od 0 I JEDNOCZEŚNIE mniejsze lub równe 14, wypisz: "Wysyłam miękkie przypomnienie SMS. Dni opóźnienia: " + opoznienia[i]
//W każdym innym przypadku (czyli dla pozostałych wartości, np. 45 dni, 100 dni), wypisz: "Sprawa przekazana do ręcznej weryfikacji. Dni opóźnienia: " + opoznienia[i]
public class ZadaniaGemini5 {
    public static void main(String[] args) {
        int[] opoznienia = {0, 12, 30, 5, 60, 45, 0, 100};
        for(int i = 0; i < opoznienia.length; i++) {
            if (opoznienia[i] == 0) {
                System.out.println("Brak opoznien. Rata oplacona.");
            } else if(opoznienia[i] == 30 || opoznienia[i] == 60) {
                System.out.println("Wysylam oficjalne wezwanie do zaplaty! Dni opoznienia: " + opoznienia[i]);
            } else if(opoznienia[i] > 0 && opoznienia[i] <= 14) {
                System.out.println("Wysylam miekkie przypomnienie SMS. Dni opoznienia: " + opoznienia[i]);
            } else {
                System.out.println("Sprawa przekazana do recznej weryfikacji. Dni opoznienia: " + opoznienia[i]);
        }
        }
    }
}