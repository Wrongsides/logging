
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Marker forSearch = MarkerFactory.getMarker("SEARCH_KEY");
    private static final Logger searchLogger = LoggerFactory.getLogger("SEARCH_KEY");

    public static void main(String[] args){
        logger.info("normal log message");

        logger.info("SEARCH_KEY as magic string in log");

        logger.info(forSearch, "normal log with search key marker");

        searchLogger.info("log from search specific logger");

        MDC.put("key","SEARCH_KEY");
        logger.info("normal log line with search key in the mdc");
        MDC.clear();

        logger.info("normal log message without after mdc is cleared");
    }
}
