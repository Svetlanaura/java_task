package loggers;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    private int counter = 0;

    @Override
    public void log(String msg) {
        counter++;

        String level = msg.toLowerCase().contains("error")
                ? "ERROR"
                : "INFO";

        System.out.println(
                level + "#" + counter + " [" + LocalDateTime.now() + "] " + msg
        );
    }
}
