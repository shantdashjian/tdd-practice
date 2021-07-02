import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


/* String set
    Develop a class that represents a string set, supporting set operations:
        - Number of strings in the set, Count
        - Add string
        - Checking if the set contains a specific string
        - Remove string
        - Union of two sets
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

    @Test
    void test_adding_string_to_set() {
        String stringAdded = "Tim";

        set.add(stringAdded);

        assertThat(set.getCount()).isEqualTo(1);
        assertThat(set.contains(stringAdded)).isTrue();
    }

    @Test
    void test_contains_string() {
        String stringAdded = "Tim";

        set.add(stringAdded);

        assertThat(set.contains(stringAdded)).isTrue();
        assertThat(set.contains("Another string")).isFalse();
    }

    @Test
    void return_count_1_when_adding_the_same_string_twice() {
        String stringAdded = "Tim";

        set.add(stringAdded);
        set.add(stringAdded);

        assertThat(set.getCount()).isEqualTo(1);
    }

    @Test
    void return_exception_when_trying_to_remove_string_not_in_set() {
        assertThrows(InvalidOperationException.class, () -> set.remove("Tim"));
    }

    @Test
    void return_removed_string_and_reduce_count_when_removing_existing_string() throws InvalidOperationException {
        String stringAdded = "Tim";
        set.add(stringAdded);

        assertThat(set.remove(stringAdded)).isEqualTo(stringAdded);
        assertThat(set.getCount()).isEqualTo(0);
    }

    @Test
    void return_union_of_two_sets() {
        StringSet set1 = new StringSet();
        set1.add("Tim");
        StringSet set2 = new StringSet();
        set2.add("Brown");

        StringSet unionSet = set1.union(set2);

        assertThat(unionSet.getCount()).isEqualTo(set1.getCount() + set2.getCount());
        assertThat(unionSet.contains("Tim")).isTrue();
        assertThat(unionSet.contains("Brown")).isTrue();
    }

    @Test
    void return_intersection_of_two_sets() {
        StringSet set1 = new StringSet();
        set1.add("Tim");
        set1.add("Kelly");
        StringSet set2 = new StringSet();
        set2.add("Brown");
        set2.add("Kelly");

        StringSet intersectionSet = set1.intersect(set2);

        assertThat(intersectionSet.getCount()).isEqualTo(1);
        assertThat(intersectionSet.contains("Kelly")).isTrue();
        assertThat(intersectionSet.contains("Tim")).isFalse();
        assertThat(intersectionSet.contains("Brown")).isFalse();
    }
}
