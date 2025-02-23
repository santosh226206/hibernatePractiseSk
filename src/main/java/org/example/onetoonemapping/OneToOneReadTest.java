package org.example.onetoonemapping;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneReadTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Question question=(Question) session.get(Question.class,4);
        System.out.println("hello");
        System.out.println(question.getText());
        System.out.println(question);
        System.out.println(question.getAnswer());
        session.close();
        sessionFactory.close();
    }

}
