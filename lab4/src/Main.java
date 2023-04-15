import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Myasoedova Julia
 * @version 1.0         */
public class Main {
    /**
     Пользователь вводит регистрационные данные о сотрудниках. Необходимо
     проверить их на корректность.
     @exception IOException при неверном вводе-выводе
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("employees.txt");

        while (true) {
            // Ввод фамилии
            System.out.print("Введите фамилию: ");
            String lastName = scanner.nextLine().trim();
            if (!isValidName(lastName)) {
                System.out.println("Некорректная фамилия. Попробуйте еще раз.");
                continue;
            }

            // Ввод имени
            System.out.print("Введите имя: ");
            String firstName = scanner.nextLine().trim();
            if (!isValidName(firstName)) {
                System.out.println("Некорректное имя. Попробуйте еще раз.");
                continue;
            }

            // Ввод мобильного телефона
            System.out.print("Введите мобильный телефон: ");
            String phone = scanner.nextLine().trim();
            if (!isValidPhone(phone)) {
                System.out.println("Некорректный номер телефона. Попробуйте еще раз.");
                continue;
            }

            // Ввод даты рождения
            System.out.print("Введите дату рождения: ");
            String birthDate = scanner.nextLine().trim();
            if (!isValidDate(birthDate)) {
                System.out.println("Некорректная дата рождения. Попробуйте еще раз.");
                continue;
            }

            // Запись данных о сотруднике в файл
            fileWriter.write(lastName + " " + firstName + ", " + phone + ", " + birthDate + "\n");
            fileWriter.flush();

            // Проверка на продолжение ввода данных
            System.out.print("Продолжить ввод данных (да/нет)? ");
            String answer = scanner.nextLine().trim();
            if (!answer.equalsIgnoreCase("да")) {
                break;
            }
        }

        fileWriter.close();
    }

    /**
     * @param name - строка с именем для проверки ввода
     */
    private static boolean isValidName(String name) {
        return name.matches("[A-Za-zА-Яа-я\\-]+");
    }

    /**
     * @param phone - строка с номером телефона для проверки ввода
     */
    private static boolean isValidPhone(String phone) {
        return phone.matches("^((\\\\+7|7|8)+([0-9]){10})$|^((\\\\+7|7|8)+\\\\(([0-9]){3}\\\\)([0-9]){3}-([0-9]){2}-([0-9]){2})$|^((\\\\+7|7|8)+-([0-9]){3}-([0-9]){2}-([0-9]){3})*$");
    }

    /**
     * @param date - строка с датой для проверки ввода
     */
    private static boolean isValidDate(String date) {
        return date.matches("(\\d{1,2}[-.:]?){2}(\\d{2}|\\d{4})");
    }
}