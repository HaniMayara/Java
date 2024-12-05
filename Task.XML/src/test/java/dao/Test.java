package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domaine.EmailNotification;
import domaine.Notification;
import domaine.SmsNotification;

public class Test {

    public static void main(String[] args) {
        // Creating configuration object
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); // Populates the data of the configuration file

        // Creating session factory object
        SessionFactory factory = cfg.buildSessionFactory();

        // Creating session object
        Session session = factory.openSession();

        // Creating transaction object
        Transaction t = session.beginTransaction();

        Notification n1 = new Notification();
        n1.setFirstName("Dr");
        n1.setLastName("Marouen");
        n1.setCreatedOn("2024-02-25"); 
        
        SmsNotification n2 = new SmsNotification();
        n2.setFirstName("Jane");
        n2.setLastName("Doe");
        n2.setCreatedOn("2024-02-25"); 
        n2.setPhoneNumber("123456789");

        EmailNotification n3 = new EmailNotification();
        n3.setFirstName("Alice");
        n3.setLastName("Smith");
        n3.setCreatedOn("2024-02-25");
        n3.setEmailAddress("alice@example.com");

        session.persist(n1);
        session.persist(n2);
        session.persist(n3);

        t.commit(); // Transaction is committed
        session.close();

        System.out.println("First notification created successfully: " + n1.toString());
        System.out.println("Second notification created successfully: " + n2.toString());
        System.out.println("Third notification created successfully: " + n3.toString());
    }
}
