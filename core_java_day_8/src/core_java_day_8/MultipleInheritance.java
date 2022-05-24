package core_java_day_8;

// how to achive multiple inheritance
interface Student1 {
	void display();
}

interface Student2 {
	void display();

	
}

class Student3 implements Student2, Student1 {
	void showData() {
	}

	@Override
	public void display() {
		System.out.println("Student 3 class");

	}

	

	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Student3 student3 = new Student3();
		student3.display();
	}
}
