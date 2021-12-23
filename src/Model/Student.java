package Model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_id")
    private int StudentId;
    private String name;
    private String Faculty;
    private String department;
    private String program;
    @OneToMany(cascade = CascadeType.ALL)
    private StudentCard studentCard;   
}
