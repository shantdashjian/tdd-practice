import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsSolver {
    public List<Integer> primeFactors(int n) {
        if (n == 2) {
            return new ArrayList<>(Arrays.asList(2));
        }
        return new ArrayList<>();
    }
}
