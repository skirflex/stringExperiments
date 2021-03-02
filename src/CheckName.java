import java.util.Scanner;

public class CheckName {
    public CheckName() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spaceIndex = 32;
        System.out.println("Введите ФИО");
        String text = scanner.nextLine().trim();
        if (text.indexOf(spaceIndex) == -1) {
            System.out.println("Неправильно написано ФИО");
        } else {
            String surname = text.substring(0, text.indexOf(spaceIndex)).trim();
            String patronymic = text.substring(text.lastIndexOf(spaceIndex)).trim();
            String name = text.substring(text.indexOf(32), text.lastIndexOf(spaceIndex)).trim();
            if (name.indexOf(32) <= 0 && surname.indexOf(32) <= 0 && patronymic.indexOf(32) <= 0 && name.length() != 0 && patronymic.length() != 0) {
                System.out.println("Фамилия :" + surname);
                System.out.println("Имя: " + name);
                System.out.println("Отчество: " + patronymic);
            } else {
                System.out.println("Неправильно написано ФИО");
            }
            // Проверка работы
        }

    }
}