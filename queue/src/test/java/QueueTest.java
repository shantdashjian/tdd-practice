import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    void throw_exception_when_trying_to_dequeue_from_empty_queue() {
        assertThatThrownBy(() -> queue.dequeue())
                .hasMessage("Queue is empty!");
    }
}
