package logger;

public class Logger {
    private static Logger instance;
    private String logFile;

    private Logger(String logFile) {
        this.logFile = logFile;
    }
    public static Logger getInstance(String logFile) {
        if (instance == null) {
            instance = new Logger(logFile);
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Logging to " + logFile + ": " + message);
    }
}