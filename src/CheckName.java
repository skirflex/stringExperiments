import java.util.Scanner;

public class CheckName {
    public CheckName() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array;
        System.out.println("Введите ФИО");
        String text = scanner.nextLine().trim();

        //================================================ Первый способ
        int spaceIndex = 32;
        if (text.indexOf(spaceIndex) == -1) {
            System.out.println("Неправильно написано ФИО");
        } else
            {
            String surname = text.substring(0, text.indexOf(spaceIndex)).trim();
            String patronymic = text.substring(text.lastIndexOf(spaceIndex)).trim();
            String name = text.substring(text.indexOf(32), text.lastIndexOf(spaceIndex)).trim();
            if (name.indexOf(32) <= 0 && surname.indexOf(32) <= 0 && patronymic.indexOf(32) <= 0 && name.length() != 0 && patronymic.length() != 0) {
                System.out.println("Фамилия: " + surname);
                System.out.println("Имя: " + name);
                System.out.println("Отчество: " + patronymic);
            } else {
                System.out.println("Неправильно написано ФИО");
            }


        //================================================ Второй способ
        }
        array = text.split("\\b\\s+");
        if (array.length == 3) {
            System.out.println("Фамилия: " + array[0]);
            System.out.println("Имя: " + array[1]);
            System.out.println("Отчество: " + array[2]);

        }
        else
        {
            System.out.println("Неправильно написано ФИО");
        }
    }
}