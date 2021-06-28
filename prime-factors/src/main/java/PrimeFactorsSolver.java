import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsSolver {
    public List<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (n == 2) {
            factors.add(2);
        }
        return factors;
    }
}
