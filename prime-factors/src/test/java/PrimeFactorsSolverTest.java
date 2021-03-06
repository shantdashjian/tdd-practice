import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void return_a_list_of_3_when_factoring_3() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(3));
        assertEquals(expected, solver.primeFactors(3));
    }

    @Test
    void return_a_list_of_2_2_when_factoring_4() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2));
        assertEquals(expected, solver.primeFactors(4));
    }

    @Test
    void return_a_list_of_5_when_factoring_5() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(5));
        assertEquals(expected, solver.primeFactors(5));
    }

    @Test
    void return_a_list_of_2_3_when_factoring_6() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 3));
        assertEquals(expected, solver.primeFactors(6));
    }

    @Test
    void return_a_list_of_7_when_factoring_7() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(7));
        assertEquals(expected, solver.primeFactors(7));
    }

    @Test
    void return_a_list_of_2_2_2_when_factoring_8() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 2));
        assertEquals(expected, solver.primeFactors(8));
    }

    @Test
    void return_a_list_of_3_3_when_factoring_9() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 3));
        assertEquals(expected, solver.primeFactors(9));
    }

    @Test
    void return_a_list_of_2_5_when_factoring_10() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 5));
        assertEquals(expected, solver.primeFactors(10));
    }

    @Test
    void return_a_list_of_13_when_factoring_13() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(13));
        assertEquals(expected, solver.primeFactors(13));
    }

    @Test
    void return_a_list_of_2_2_5_5_when_factoring_100() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 5, 5));
        assertEquals(expected, solver.primeFactors(100));
    }

    @Test
    void return_an_empty_list_when_factoring_minus_1() {
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solver.primeFactors(-1));
    }


}