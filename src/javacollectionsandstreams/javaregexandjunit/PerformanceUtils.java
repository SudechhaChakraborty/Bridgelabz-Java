package javaregexandjunit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class PerformanceUtils {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Done";
    }
}

class PerformanceUtilsTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testTimeout() throws InterruptedException {
        PerformanceUtils utils = new PerformanceUtils();
        utils.longRunningTask();
    }
}