package Week1.Design_Patterns_and_Principles.SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Same Logger instance (Singleton verified)");
        } else {
            System.out.println("Different Logger instances (Singleton verification failed)");
        }
    }
}
