package uk.co.poggs.test.spring2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = Spring2Application.class)
@ExtendWith(SpringExtension.class)
class Spring2ApplicationIT {

    public static final Logger logger = LoggerFactory.getLogger(Spring2ApplicationIT.class);

    @Test
    void dummyTest() {
        logger.warn("Integration test");
        assertTrue(true);
    }

}
