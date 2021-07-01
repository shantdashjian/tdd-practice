import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {

    private Stack stack;

    @BeforeEach
    void setup() {
        stack = new Stack();
    }

    @Test
    void return_size_0_for_empty_stack() {
        assertThat(stack.getSize()).isEqualTo(0);
    }

    @Test
    void return_size_1_when_pushing_1_item() {
        stack.push("Tim");

        assertThat(stack.getSize()).isEqualTo(1);
    }
}
