package logger;

public class Logger {
    private String logFile;

    public Logger(String logFile) {
        this.logFile = logFile;
    }

    public void log(String message) {
        System.out.println("Logging to " + logFile + ": " + message);
    }

}
