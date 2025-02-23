package org.example.onetoonemapping;

//import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneUpdateTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Answer answer=(Answer) session.get(Answer.class,5);
        //answer.setId(10L);
        answer.setText("Hibernate is good");
        session.merge(answer);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
