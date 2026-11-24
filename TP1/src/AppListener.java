import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        System.out.println("TP1 application started!");
    }

    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("TP1 application stopped!");
    }
}