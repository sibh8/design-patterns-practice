package org.example.patterns.prototype;


public class Student implements Prototype<Student>{
    private Integer age;
    private String name;
    private String batch;
    private Double psp;
    private Double avgBatchPsp;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Double getPsp() {
        return psp;
    }

    public void setPsp(Double psp) {
        this.psp = psp;
    }

    public Double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(Double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public Student() {
    }

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batch = student.batch;
        this.avgBatchPsp = student.avgBatchPsp;
    }

    @Override
    public Student clone() {

        return new Student(this);
    }
}
