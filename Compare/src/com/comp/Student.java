package com.comp;
/**
 * author Shubham katiyar
 */

public class Student {
private int id;
private String name;
private double cgpa;

public Student(int id, String name, double cgpa) {
    super();
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
 }

// Getter methods.
int getid(){
	return id;
}

String getname(){
	return name;
}

double getcgpa(){
	return cgpa;
}
}
