public class Main3 {
    public static void main(String[] args) {
        int max = 500;
        int min = 300;
        int size = 10;

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.floor((Math.random() * (max - min + 1)) + min);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i <= 10 ; i++) {
            System.out.println((double) Math.round((Math.random() * (7.25 - 3.12) + 3.12) * 100) / 100);
        }
    }
}
