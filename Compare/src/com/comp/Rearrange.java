package com.comp;

import java.util.Comparator;

public class Rearrange implements Comparator<Student> {

	public int compare(Student obj1, Student obj2) {
		if(obj1.getcgpa()<obj2.getcgpa()){
			return 1;
		}
		else if(obj1.getcgpa()>obj2.getcgpa()){
			return -1;
		}
		else{
			// same cgpa so now compare name.
			int n=obj1.getname().compareTo(obj2.getname());
			
			if(n==0){
				// same cgpa and name so compare their id.
			if(obj1.id>obj2.id){
				return 1;
			}
			else{
				return -1;
			}
			}
			else{
				return n;	
			}
				
		}
	}


}
