package peaksoft.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.example.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();


try {
    Session session = sessionFactory.openSession();
    Student student = new Student("Gulnur","Bakirova",26);
    session.beginTransaction();
    session.save(student);
    session.getTransaction().commit();
    session.close();
}finally {
    System.out.println("Successfully");
}



    }
}
