import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    void setup() {
        queue = new Queue();
    }

    @Test
    void return_size_0_for_empty_queue() {
        assertThat(queue.getSize()).isEqualTo(0);
    }

    @Test
    void return_size_1_when_enqueueing_one_item() {
        queue.enqueue(1);

        assertThat(queue.getSize()).isEqualTo(1);
    }
}
