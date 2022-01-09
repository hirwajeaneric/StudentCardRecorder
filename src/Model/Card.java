package Model;

import javax.persistence.*;

/**
 *
 * @author liliane
 */
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cardId;
    private int regNo;
    private String name;
    private String faculty;
    private String department;
    private String program;
    @Lob
    @Column(name = "image" ,columnDefinition = "LONGBLOB")    
    private byte[] image;

    public Card() {
    }

    public Card(int cardId, int regNo, String name, String faculty, String department, String program, byte[] image) {
        this.cardId = cardId;
        this.regNo = regNo;
        this.name = name;
        this.faculty = faculty;
        this.department = department;
        this.program = program;
        this.image = image;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    
}
