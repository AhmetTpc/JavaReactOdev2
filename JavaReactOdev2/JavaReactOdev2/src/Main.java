
public class Main {

	public static void main(String[] args) {
		
		
		Course kurs=new Course();
		kurs.id=0;
		kurs.name="Java";
		kurs.description="2 Ayl�k java kursu.";
		kurs.coursePrice="�cretsiz";
		
		Course kurs1=new Course();
		kurs1.id=1;
		kurs1.name="C++";
		kurs1.description="2 Ayl�k C++ kursu.";
		kurs1.coursePrice="�cretsiz";
		
		Course [] courses= {kurs,kurs1};
		
		for(Course course:courses ) {
			System.out.println(course.name);
		}
		
		CourseManager kursMethod=new CourseManager();
		kursMethod.addCourse(kurs);
		kursMethod.removeCourse(kurs1);
		
	}

}
