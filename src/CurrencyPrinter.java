import java.util.function.Consumer;

public class CurrencyPrinter {
    public static void main(String[] args) {
        Consumer<String> bynToUsdPrinter = input -> {
            String[] parts = input.split(" ");
            double amountInByn = Double.parseDouble(parts[0]);
            double amountInUsd = amountInByn / 3.14;
            System.out.println("Сумма в долларах: " + amountInUsd);
        };

        String inputAmount = "100 BYN";
        bynToUsdPrinter.accept(inputAmount);
    }
}
