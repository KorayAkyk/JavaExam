package korayakyurek;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    @SuppressWarnings("deprecation")
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().setProperty("hibernate.connection.username", System.getenv("DB_USER") == null ? "" : System.getenv("DB_USER")).setProperty("hibernate.connection.password", System.getenv("DB_PASSWORD") == null ? "" : System.getenv("DB_PASSWORD")).buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}