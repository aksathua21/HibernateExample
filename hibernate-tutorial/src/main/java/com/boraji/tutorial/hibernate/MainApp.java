package com.boraji.tutorial.hibernate;

import org.hibernate.Session;

import com.arun.entity.Employee;
import com.arun.entity.Task;

public class MainApp {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Employee e = new Employee();
    e.setId(103);
    e.setFirstName("barun");
    e.setLastName("Sathua");
    e.setSalary(40000);
    Task task = new Task();
    task.setId(1);
    task.setDesc("Update API not working...");
    task.setStatus("Open");
    task.setEmp(e);
    session.save(task);
    session.getTransaction().commit(); 
    session.close();
    HibernateUtil.shutdown();
  }
}
