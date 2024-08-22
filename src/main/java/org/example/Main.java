package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Lecturer;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Shima", "Fernando");

        Student student = new Student();
        student.setId(1);
        student.setName(fullName);
        student.setAddress("Moratuwa");

        Student student1 = new Student();
        student1.setId(2);
        student1.setName(new FullName("Nehara", "Peiris"));
        student1.setAddress("Moratuwa");

        Student student2 = new Student();
        student2.setId(3);
        student2.setName(new FullName("Shewmi", "Peiris"));
        student2.setAddress("Moratuwa");


        Lecturer lecturer = new Lecturer();
        lecturer.setId(1);
        lecturer.setFullname(new FullName("Madhu", "Perera"));
        lecturer.setAddress("Panadura");
        lecturer.setYrsOfExp(10);


        // Open transaction
        Transaction transaction = session.beginTransaction();


        // Save
        session.save(student);
        session.save(student1);
        session.save(student2);

        session.save(lecturer);


        /*
        // Update
        session.update(student);
        */

        /*
        // Delete
        session.delete(student2);
        */

        /*
        // Get
        Student student3 = session.get(Student.class, 2);
        System.out.println(student3.toString());
        */


        transaction.commit();
        session.close();
    }
}
