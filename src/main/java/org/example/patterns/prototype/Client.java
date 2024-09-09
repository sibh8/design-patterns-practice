package org.example.patterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry){
        Student beginnerMorningStudent = new Student();
        beginnerMorningStudent.setAvgBatchPsp(75.0);
        beginnerMorningStudent.setBatch("June23 Beginner MWF");

        registry.register("beginnerMorningStudent", beginnerMorningStudent);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAvgBatchPsp(75.0);
        intelligentStudent.setBatch("June23 Beginner MWF");
        intelligentStudent.setIq(170);

        registry.register("intelligentStudent", intelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);
        Student sid = registry.get("beginnerMorningStudent").clone();
        sid.setName("Siddhesh");
        sid.setAge(25);
        sid.setPsp(90.0);

        Student alok = registry.get("intelligentStudent").clone();
        alok.setName("Alok");
        alok.setAge(24);
        alok.setPsp(92.0);

        System.out.println("DEBUG");

    }
}
