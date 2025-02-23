package org.example.onetoonemapping;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Question question = new Question();
        question.setText("What is Hibernate?");

        Answer answer = new Answer();
        answer.setText("Hibernate is an ORM framework.");
        //answer.setQuestion(question); // Set the bidirectional relationship

        question.setAnswer(answer);
        Transaction transaction=session.beginTransaction();
        session.merge(question);
        session.merge(answer);
        transaction.commit();
        session.close();
        sessionFactory.close();
        //session.close();
    }
}
