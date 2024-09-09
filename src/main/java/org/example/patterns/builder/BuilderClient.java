package org.example.patterns.builder;

public class BuilderClient {
    public static void main(String[] args) {
        Student student = Student.builder()
                .setId(1)
                .setName("Sid")
                .setAddress("Pune")
                .setBatch("Morning")
                .setGradYear(2021)
                .setPhoneNumber("+025433456")
                .build();

        System.out.println("ID: "+student.getId());
        System.out.println("Name: "+student.getName());
        System.out.println("Address: "+student.getAddress());
        System.out.println("Batch: "+student.getBatch());
        System.out.println("Grad Year: "+student.getGradYear());
        System.out.println("Phone number: "+student.getPhoneNumber());
    }
}
