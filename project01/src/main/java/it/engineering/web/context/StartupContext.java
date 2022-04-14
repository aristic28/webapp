package it.engineering.web.context;

import java.util.ArrayList;
import java.util.List;



import it.engineering.web.model.Korisnik;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/**
 * Application Lifecycle Listener implementation class StartupContext
 *
 */
@WebListener
public class StartupContext implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public StartupContext() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("@WebListener MyContextListener: contextDestroyed");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("@WebListener MyContextListener: contextInitialized");
    
    	//users.add(new User("admin", "admin"));
    	
    	
    	sce.getServletContext().setAttribute("login_users", new ArrayList<Korisnik>());
    }
	
}
