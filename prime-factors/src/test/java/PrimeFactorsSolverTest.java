import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsSolverTest {

    @Test
    void return_an_empty_list_when_factoring_1() {
        PrimeFactorsSolver solver = new PrimeFactorsSolver();
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, solver.primeFactors(1));
    }

}