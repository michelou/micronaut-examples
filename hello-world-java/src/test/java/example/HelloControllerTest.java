package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import io.micronaut.test.annotation.MicronautTest; // deprecated since 1.3
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class HelloControllerTest {

    @Inject
    HelloClient helloClient;

    @Test
    void testHello() {
        assertEquals(
                "Hello Fred!",
                helloClient.hello("Fred").blockingGet());
    }
}
