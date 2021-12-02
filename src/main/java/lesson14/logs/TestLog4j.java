package lesson14.logs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.*;

public class TestLog4j {
    public static void main(String[] args) {
        PropertyConfigurator.configure("src/main/resources/logs/configs/log4j.properties");

        Logger admin = Logger.getLogger("admin");
        admin.info("info");
        admin.warn("w");


        Logger file = Logger.getLogger("file");
        file.info("info");
        file.warn("wa");

        try {
            System.out.println(2 / 0);
        } catch (RuntimeException e) {
            file.error(e.getMessage());
        }
    }

    /**
     * TRACE
     * DEBUG
     * INFO
     * WARN
     * ERROR
     * FATAL
     * OFF
     */

}

