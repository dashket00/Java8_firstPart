import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 10, 0, -3, 8, -2);

        Predicate<Integer> isPositive = num -> num > 0;

        numbers.stream()
                .filter(isPositive)
                .forEach(System.out::println);
    }
}
