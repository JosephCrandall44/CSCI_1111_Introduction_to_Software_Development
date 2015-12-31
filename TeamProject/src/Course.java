import java.util.ArrayList;


public class Course {
	
	private String CourseName;
    private int CourseNumber;
    private String CourseProfessor;
   
    static ArrayList<Student> studentArray = new ArrayList <Student>();
    static ArrayList<Professor> professorArray = new ArrayList <Professor>();
    
    
	

	public Course(String CourseName, String CourseNumber, String CourseProfessor)
	    {
		CourseName = CourseName;
		CourseNumber = CourseNumber;
		CourseProfessor = CourseProfessor;
	    }

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getCourseNumber() {
		return CourseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		CourseNumber = courseNumber;
	}

	public String getCourseProfessor(){
		return CourseProfessor;
	}
	
	public void setCourseProfessor(String courseProfessor){
		CourseProfessor = courseProfessor;
	}
	
	public static ArrayList<Student> getStudentArray() {
		return studentArray;
	}

	public static void setStudentArray(ArrayList<Student> studentArray) {
		Course.studentArray = studentArray;
	}

	public static ArrayList<Professor> getProfessorArray() {
		return professorArray;
	}

	public static void setProfessorArray(ArrayList<Professor> professorArray) {
		Course.professorArray = professorArray;
	}
	
	}


