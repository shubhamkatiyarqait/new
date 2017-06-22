package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Getinput {
	
	
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of entries");
		int entries =scan.nextInt();;
		
		 List <Student> list= new ArrayList<Student>();
		
		for(int i=0; i<entries;i++){
			int id = scan.nextInt();
	         String name = scan.next();
	         double cgpa = scan.nextDouble();
	         
	         list.add(new Student(id,name,cgpa));
		}
		scan.close();
		Collections.sort(list,Collections.reverseOrder(new CompareId()));  
		 
		 Collections.sort(list,new CompareName());
		 
		 Collections.sort(list,Collections.reverseOrder(new CompareCGPA())); 
		 
		 
		 Iterator itr=list.iterator(); 
		 
		 while(itr.hasNext()){  
		 Student st=(Student)itr.next();  
		 System.out.println(st.name);  
	}

}
}
