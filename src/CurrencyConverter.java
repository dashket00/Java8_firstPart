import java.util.function.Function;

public class CurrencyConverter {
    public static void main(String[] args) {
        Function<String, Double> bynToUsdConverter = input -> {
            String[] parts = input.split(" ");
            double amountInByn = Double.parseDouble(parts[0]);
            return amountInByn / 3.14;
        };

        String inputAmount = "100 BYN";
        double result = bynToUsdConverter.apply(inputAmount);
        System.out.println("Сумма в долларах: " + result);
    }
}
