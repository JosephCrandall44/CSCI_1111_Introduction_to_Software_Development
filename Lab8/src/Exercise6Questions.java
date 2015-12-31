public class Exercise6Questions {
		
		private String question;
		private int answer;
		private int user_answer;
		
		public Exercise6Questions (String question, int answer, int user_answer) {
			this.question = question;
			this.answer = answer;
			this.user_answer = user_answer;
		}
		
		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public int getAnswer() {
			return answer;
		}

		public void setAnswer(int answer) {
			this.answer = answer;
		}
		
		public int getUser_answer() {
			return user_answer;
		}

		public void setUser_answer(int user_answer) {
			this.user_answer = user_answer;
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
