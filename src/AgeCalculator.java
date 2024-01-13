import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате (гггг-мм-дд): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(inputDate, formatter);
        LocalDate hundredYearsLater = birthDate.plusYears(100);

        DayOfWeek dayOfWeek = hundredYearsLater.getDayOfWeek();

        System.out.println("Через 100 лет вам будет " + hundredYearsLater.format(formatter) +
                " и это будет " + dayOfWeek.toString());
    }
}
