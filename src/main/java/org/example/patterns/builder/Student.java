package org.example.patterns.builder;

public class Student {
    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    private String psp;
    private String batch;
    private Integer gradYear;

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    private Student(StudentBuilder studentBuilder){
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.address = studentBuilder.address;
        this.phoneNumber = studentBuilder.phoneNumber;
        this.psp = studentBuilder.psp;
        this.batch = studentBuilder.batch;
        this.gradYear = studentBuilder.gradYear;
    }

    static class StudentBuilder {
        private Integer id;
        private String name;
        private String address;
        private String phoneNumber;
        private String psp;
        private String batch;
        private Integer gradYear;

        public Student build(){
            if(gradYear < 2020){
                System.out.println("Throwing exception as Grad year is less than 2020");
                throw new IllegalArgumentException();
            }
            return new Student(this);
        }

        public StudentBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setPsp(String psp) {
            this.psp = psp;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setGradYear(Integer gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPsp() {
        return psp;
    }

    public String getBatch() {
        return batch;
    }

    public Integer getGradYear() {
        return gradYear;
    }
}
