import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeFactorsSolverTestWithAssertJ {

    private static PrimeFactorsSolver solver;

    @BeforeAll
    static void setup() {
        solver = new PrimeFactorsSolver();
    }

    @Test
    void return_an_empty_list_when_factoring_1() {
        List<Integer> expected = new ArrayList<>();
        assertThat(solver.primeFactors(1)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_2_when_factoring_2() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2));
        assertThat(solver.primeFactors(2)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_3_when_factoring_3() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(3));
        assertThat(solver.primeFactors(3)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_2_2_when_factoring_4() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2));
        assertThat(solver.primeFactors(4)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_5_when_factoring_5() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(5));
        assertThat(solver.primeFactors(5)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_2_3_when_factoring_6() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 3));
        assertThat(solver.primeFactors(6)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_7_when_factoring_7() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(7));
        assertThat(solver.primeFactors(7)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_2_2_2_when_factoring_8() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 2));
        assertThat(solver.primeFactors(8)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_3_3_when_factoring_9() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 3));
        assertThat(solver.primeFactors(9)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_2_5_when_factoring_10() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 5));
        assertThat(solver.primeFactors(10)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_13_when_factoring_13() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(13));
        assertThat(solver.primeFactors(13)).isEqualTo(expected);
    }

    @Test
    void return_a_list_of_2_2_5_5_when_factoring_100() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 5, 5));
        assertThat(solver.primeFactors(100)).isEqualTo(expected);
    }

    @Test
    void return_an_empty_list_when_factoring_minus_1() {
        List<Integer> expected = new ArrayList<>();
        assertThat(solver.primeFactors(-1)).isEqualTo(expected);
    }


}