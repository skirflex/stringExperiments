import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String number = scanner.nextLine().trim();

            number = number.replaceAll("[^0-9]", "");
            number = number.replaceAll("\\s", "");

            if (number.length() == 11) {
                number.substring(1, 11);
                number = "+7"  + " " + number.charAt(1) + number.charAt(2) + number.charAt(3) + " "
                + number.charAt(4) + number.charAt(5) + number.charAt(6) + "-" +number.charAt(7) + number.charAt(8) +
                "-" + number.charAt(9) + number.charAt(10);
                System.out.println(number);

            }
            else if (number.length() == 10) {
                number = "+7"  + " " + number.charAt(0) + number.charAt(1) + number.charAt(2) + " "
                        + number.charAt(3) + number.charAt(4) + number.charAt(5) + "-" +number.charAt(6) + number.charAt(7) +
                        "-" + number.charAt(8) + number.charAt(9);
                System.out.println(number);
            }
            else
            {
                System.out.println("Номер телефона введён неправильно");

            }
        }


}
