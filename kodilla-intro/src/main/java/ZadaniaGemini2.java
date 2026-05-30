//Zadanie 2: System wyłapywania podejrzanych transakcji
//Wyobraź sobie, że masz moduł, który analizuje historię ostatnich operacji na koncie klienta. Historia ta zapisana jest w postaci tablicy liczb całkowitych. Wartości dodatnie to wpływy, a ujemne to wydatki.
//Twoim celem jest napisanie logiki, która przejdzie przez całą tę historię i wypisze na ekran tylko te wpływy, które system uznaje za "podejrzanie duże" – załóżmy, że próg alarmowy to każda transakcja większa niż 1000.
public class ZadaniaGemini2 {
    public static void main(String[] args) {
        int[] transakcje = {500, -120, 4500, -40, 15000, -300, 200};
        for (int i = 0; i < transakcje.length; i++) {
            if (transakcje[i] > 1000) {
                System.out.println(transakcje[i]);
            }
        }
    }
}