import java.util.Scanner;
import java.util.function.Supplier;

public class ReverseInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Supplier<String> reverseInput = () -> {
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };

        System.out.println("Результат: " + reverseInput.get());
    }
}
