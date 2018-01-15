package Factory;

public class ReebokBall  implements Ball{
	@Override
	public void createBall() {
		System.out.println("Created Reebok Ball");
	}
}