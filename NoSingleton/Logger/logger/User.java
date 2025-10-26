package logger;

public class User{
        public static void main(String[] args) {
        Logger logger1 = new Logger("file_1.txt");
        Logger logger2 = new Logger("file_2.txt");

        logger1.log("Message 1");
        logger2.log("Message 2");

        System.out.println((logger1 == logger2));
    }

}
