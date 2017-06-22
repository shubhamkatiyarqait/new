package com.comp;

public class Student {
int id;
String name;
double cgpa;

public Student(int id, String name, double cgpa) {
    super();
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
 }

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
