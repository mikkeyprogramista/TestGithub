import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;

        do {
            System.out.println("Podaj pierwszą liczbę dwucyfrową: ");
            String first = sc.nextLine();

            System.out.println();

            System.out.println("Podaj drugą liczbę dwucyfrową: ");
            String second = sc.nextLine();

            boolean valid = false;

            for (int i = 0; i < first.length(); i++) {
                if (valid) {
                    break;
                }

                for (int j = 0; j < second.length(); j++) {
                    if (valid) {
                        break;
                    }

                    if (first.charAt(i) == second.charAt(j)) {
                        valid = true;
                    }
                }
            }

            System.out.println(valid);

            System.out.println();

            System.out.println("Chcesz zakończyć? (true | false): ");
            stop = sc.nextBoolean();

            System.out.println();
        } while (!stop);
    }
}