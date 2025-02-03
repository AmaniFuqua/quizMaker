package quizMaker;

public class Questions
	{
		public static Object board;
		private String question;
		private int pAns;
		public Questions (String q, int p)
			{
				question = q;
				pAns = p;
			}
		public String getQuestion()
			{
				return  question;
			}
		public void setQuestion(String  question)
			{
				this.question = question;
			}
		public int getPans()
			{
				return pAns;
			}
		public void setPans(int pAns)
			{
				this.pAns = pAns;
			}
		
	}
