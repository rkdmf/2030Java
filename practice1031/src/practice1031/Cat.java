package practice1031;

public class Cat extends Pet{

	private double jumpingHeight;

	public Cat(String ownerName, double height)

	{

		super(ownerName);

		this.jumpingHeight = height;

	}





	public double JumpingHeight()

	{

		return jumpingHeight;

	

}

	

	public void Cry()

	{

		System.out.println("Miyaong Miyaong");

	}

}

