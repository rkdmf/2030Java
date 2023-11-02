package practice1031;

public class Dog extends Pet{

	private double runSpeed;

	public Dog(String ownerName, double speed)

	{

		super(ownerName);

		this.runSpeed = speed;

	}

	

	

	public double RunSpeed()

	{

		return runSpeed;

	}

	

	public void Cry()

	{

		System.out.println("Mong Mong");

	}

	

}

{

}
