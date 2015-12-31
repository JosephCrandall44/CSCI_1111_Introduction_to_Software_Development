
public class Question {
	String question;
	int answer;
	
	public void Circle (int answer, String question) {
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion(){
		return question;
	}
	public void setQuestion(String question){
		this.question = question;
	}
	public int getAnswer(){
		return answer;
	}
	public void setAnswer(int i){
		this.answer = i;	
	}

	public boolean correct(int user_answer) {
		if (answer == user_answer){
			return true;
		}
		else{
		return false;
	}
}
}
