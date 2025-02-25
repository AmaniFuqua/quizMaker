package quizMaker;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit a = new Peach();
		a.squish();
		((Peach)a).color();
		Strawberry b = new Strawberry();
		b.squish();
		b.color();
		Fruit c = new Strawberry();
		((Strawberry)c).plant();
		Fruit d = new Fruit();
		d.taste();
		((Peach)a).quality();
	}

}
