package cgg.springcore.javaconfig;

import org.springframework.context.annotation.Configuration;

//@Component("firststudent")
public class Student {
	private Samosa samosa;

	public Student(Samosa samosa) {
		this.samosa=samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book");
	
	}
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

}
