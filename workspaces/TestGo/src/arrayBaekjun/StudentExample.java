package arrayBaekjun;

import java.util.Arrays;
import java.util.Comparator;

public class StudentExample {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student("Ken",100),
				new Student("Shin", 60),
				new Student("kim", 80)};
		
		Comparator<Student> comparator = new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2){
				return Integer.compare(o2.getScore(), o1.getScore());
			}
				
		};

		Arrays.sort(students, comparator);

		for (Student student : students){
			System.out.println(student.getName() + ":" + student.getScore());
		}
	}

}
