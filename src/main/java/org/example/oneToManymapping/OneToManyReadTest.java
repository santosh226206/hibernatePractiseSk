package org.example.oneToManymapping;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToManyReadTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Question question=(Question) session.get(Question.class,6);
        System.out.println("hello");
        System.out.println(question.getText());
        System.out.println(question);
        System.out.println(question.getAnswer());
        session.close();
        sessionFactory.close();
    }
}
