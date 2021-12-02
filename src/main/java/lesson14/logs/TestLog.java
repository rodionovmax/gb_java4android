package lesson14.logs;

import lombok.Data;
import lombok.Getter;

import java.io.IOException;
import java.util.logging.*;

public class TestLog {

    @Getter
    protected static final Logger logger = Logger.getLogger("TestLog");

    public static void main(String[] args) throws IOException {

        logger.setLevel(Level.ALL);

        Handler handler = new FileHandler("src/main/resources/logs/myLogFromLogger.log");

        logger.addHandler(handler);
//        handler.setFormatter(new SimpleFormatter());

        logger.getHandlers()[0].setLevel(Level.ALL);
//        logger.getHandlers()[0].setFormatter(new SimpleFormatter());
        logger.getHandlers()[0].setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("%s \t %s \t %s%n", record.getLevel(), record.getMillis(), record.getMessage());
            }
        });


        logger.log(Level.SEVERE, "Логирование S");
        logger.finer("Логирование F");
        logger.log(Level.INFO, "Логирование I");
        logger.warning("Логирование W");
        logger.config("Логирование С");
    }


    //OFF
    //SEVERE
    //WARNING
    //INFO
    //----------
    //CONFIG
    //FINE(3)
    //ALL
}
