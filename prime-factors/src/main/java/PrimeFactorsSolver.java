import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsSolver {
    public List<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (n == 2 || n == 3) {
            factors.add(n);
        }
        return factors;
    }
}
