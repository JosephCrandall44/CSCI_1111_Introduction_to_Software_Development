import java.util.ArrayList;


public class ProfessorOld {
	
	private String ProfessorName;
    private ArrayList<Course> Course1 = new ArrayList <Course>();
    
    public ProfessorOld(String ProfessorName)
    {
    ProfessorName = ProfessorName;
    }

	public String getProfessorName() {
		return ProfessorName;
	}

	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}

	public ArrayList<Course> getCourse1() {
		return Course1;
	}

	public void setCourse1(ArrayList<Course> course1) {
		Course1 = course1;
	}
	
	

}
