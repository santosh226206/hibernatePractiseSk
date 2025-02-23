package org.example.oneToManymapping;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class OneToManyTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
//        Question question = new Question();
//        question.setText("What is Hibernate?");
//
//        Answer answer = new Answer();
//        answer.setText("Hibernate is an ORM framework0.");
//        Answer answer1 = new Answer();
//        answer1.setText("Hibernate is an ORM framework1.");
//        Answer answer2 = new Answer();
//        answer2.setText("Hibernate is an ORM framework2.");
//        Answer answer3 = new Answer();
//        answer3.setText("Hibernate is an ORM framework3.");
//        //answer.setQuestion(question); // Set the bidirectional relationship
//        List<Answer> answers=new ArrayList<>();
//        answers.add(answer);
//        answers.add(answer1);
//        answers.add(answer2);
//        answers.add(answer3);
//        question.setAnswer(answers);
        Question question = new Question();
        question.setText("What is Hibernate?");

        Answer answer1 = new Answer();
        answer1.setText("Hibernate is an ORM framework.");
        answer1.setQuestion(question); // Set the relationship

        Answer answer2 = new Answer();
        answer2.setText("It simplifies database interactions.");
        answer2.setQuestion(question); // Set the relationship
        List<Answer> answers=new ArrayList<>();
       answers.add(answer1);
        answers.add(answer2);
        question.setAnswer(answers);
        Transaction transaction=session.beginTransaction();
        session.merge(question);
        //session.merge(answer);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
