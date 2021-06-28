import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsSolver {
    public List<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        int factor = 2;
        while (n > 1) {
            while (n % factor == 0) {
                n = n / factor;
                factors.add(factor);
            }
            factor++;
        }
        return factors;
    }
}
