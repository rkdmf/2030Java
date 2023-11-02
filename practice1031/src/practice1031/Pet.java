package practice1031;

public abstract class Pet {
	protected String owner;

	public Pet(String owner)

	{

		this.owner = owner;

	}

	public String OwnerName()

	{

		return owner;

	}

	public abstract void Cry();

}
