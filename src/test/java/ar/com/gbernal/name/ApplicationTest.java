package ar.com.gbernal.name;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(profiles = "dev")
class ApplicationTest {

    @Test
    void contextLoads() {
    }

}
