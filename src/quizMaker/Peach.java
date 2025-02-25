package quizMaker;
public class Peach extends Fruit {
	public void quality()
	{
		System.out.println("Very Fresh.");
	}
	public void squish()
	{
		System.out.println("It goes crack its to smushy. ");
		super.squish();
	}
	public void color()
	{
		System.out.println("A mix of red and orange. ");
	}
}
