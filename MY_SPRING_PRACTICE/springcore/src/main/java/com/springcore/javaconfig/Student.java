package com.springcore.javaconfig;


/*@Component("myStudent")*/
public class Student {
	
	private Stream stream;
	
	public Stream getStram() {
		return stream;
	}

	public void setStram(Stream stram) {
		this.stream = stram;
	}

	public Student(Stream stram) {
		super();
		this.stream = stram;
	}
	
	public void study(){
		
		this.stream.displayName();
		System.out.println("Student is studying .....");
	}
	
	

}
