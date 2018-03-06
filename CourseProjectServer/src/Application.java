import dao.BaseDAO;
import utils.Logger;

public class Application {
    public static void main(String[] args) {
        Logger logger = new Logger();

//        Attaching a small portion of code to the quitting of the application for it to log the time it got terminated
        Runtime.getRuntime().addShutdownHook(new Thread(() -> logger.info("Exit", "Application terminated")));
    }
}
