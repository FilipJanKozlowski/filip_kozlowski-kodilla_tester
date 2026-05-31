import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj pierwsza litere koloru (C-czarny, N-niebieski, Z-zielony, F-fioletowy, S-szary):");
            String letter = scanner.nextLine().trim().toUpperCase();

            switch (letter) {
                case "C":
                    return "Czarny";
                case "N":
                    return "Niebieski";
                case "Z":
                    return "Zielony";
                case "F":
                    return "Fioletowy";
                case "S":
                    return "Szary";
                default:
                    System.out.println("Bledna litera. Sprobuj ponownie.");
            }
        }
    }
}