import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsSolver {
    public List<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (n % 2 == 0) {
            n = n / 2;
            factors.add(2);
        }
        if (n == 2 || n == 3) {
            factors.add(n);
        }
        return factors;
    }
}
