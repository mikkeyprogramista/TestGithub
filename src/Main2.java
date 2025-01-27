import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = {
                "Furmany, Kościelna, 51",
                "Gorzyce, Wajsowa, 67",
                "Kolbuszowa, Sopczykowa, 12"
        };

        String[] towns = new String[strings.length];
        String[] streets = new String[strings.length];
        String[] numbers = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            towns[i] = strings[i].substring(0, strings[i].indexOf(","));
            streets[i] = strings[i].substring(strings[i].indexOf(",") + 1, strings[i].lastIndexOf(","));
            numbers[i] = strings[i].substring(strings[i].lastIndexOf(",") + 1);
        }

        for (String town : towns) {
            System.out.println(town.trim());
        }

        System.out.println();

        for (String street : streets) {
            System.out.println(street.trim());
        }

        System.out.println();

        for (String number : numbers) {
            System.out.println(number.trim());
        }

    }
}
