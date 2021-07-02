import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


    /* String set
        Develop a class that represents a string set, supporting set operations:
            Number of strings in the set, Count
            Add string
            Checking if the set contains a specific string
            Remove string
            Union of two sets
            Intersection of two sets.
            Clearing the set.
            Enumerating the set.

     */
public class StringSetTest {
    private StringSet set;

    @BeforeEach
    void setup() {
        set = new StringSet();
    }

    @Test
    void return_0_when_asking_for_count() {
        int count = set.getCount();

        assertThat(count).isEqualTo(0);
    }
}
