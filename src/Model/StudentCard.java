package Model;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class StudentCard {
    @Id
    @Column(name = "card_id")
    private int id;
    @ManyToMany(mappedBy = "StudentCard")
    private Student student_id;

    public StudentCard() {
    }
/*
    public StudentCard(int id,int student_id) {
        this.id = id;
        this.student_id = student_id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }
  */  
    
}