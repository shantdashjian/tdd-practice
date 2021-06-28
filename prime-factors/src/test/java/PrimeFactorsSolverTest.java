import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsSolverTest {

    private static PrimeFactorsSolver solver;

    @BeforeAll
    static void setup() {
        solver = new PrimeFactorsSolver();
    }
    @Test
    void return_an_empty_list_when_factoring_1() {
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solver.primeFactors(1));
    }

    @Test
    void return_a_list_of_2_when_factoring_2() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2));
        assertEquals(expected, solver.primeFactors(2));
    }

}