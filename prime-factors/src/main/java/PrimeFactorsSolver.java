import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsSolver {
    public List<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        while (n % 2 == 0) {
            n = n / 2;
            factors.add(2);
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
