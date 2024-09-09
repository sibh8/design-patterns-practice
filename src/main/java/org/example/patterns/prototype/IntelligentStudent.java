package org.example.patterns.prototype;

public class IntelligentStudent extends Student implements Prototype<Student>{
    private Integer iq;

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public IntelligentStudent(){
    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
