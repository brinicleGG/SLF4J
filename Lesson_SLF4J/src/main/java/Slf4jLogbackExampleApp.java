import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Slf4jLogbackExampleApp {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Slf4jLogbackExampleApp.class);

    private static final String FILENAME = "/file/does/not/exist";

    public static void main(String[] args) {
        LOGGER.info("Just a log message");
        LOGGER.debug("Message for debug level.");
        try {
            Files.readAllBytes(Paths.get(FILENAME));
        } catch (IOException ioex) {
            LOGGER.error("Failed to read file {}.", FILENAME, ioex);
        }
        Slf4jLogbackCommonsLoggingExample.logCommonsLogging();
    }
}
