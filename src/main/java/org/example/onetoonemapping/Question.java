package org.example.onetoonemapping;

import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id")
    private Answer answer;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

//    @Override
//    public String toString() {
//        return "Question{" +
//                "id=" + id +
//                ", text='" + text + '\'' +
//                ", answer=" + answer +
//                '}';
//    }
}
