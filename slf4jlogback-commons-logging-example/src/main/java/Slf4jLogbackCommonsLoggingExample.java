import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Slf4jLogbackCommonsLoggingExample {

    public static final Log log = LogFactory.getLog(Slf4jLogbackCommonsLoggingExample.class);

    public static void logCommonsLogging() {
        log.debug("Debug message for commons logging");
        log.info("info message to commons logging");
    }
}
