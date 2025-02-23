package org.example.onetoonemapping;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneDelete {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Question question=(Question) session.get(Question.class,5);
        session.remove(question);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
