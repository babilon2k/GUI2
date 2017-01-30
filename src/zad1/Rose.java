package zad1;

public class Rose extends Flowers
{

	protected Rose(int amount)
	{
		super(amount);
	}

	protected Rose(String name, String color)
	{
		super(name, color);
	}

	@Override
	public String getName()
	{
		return "róża";
	}

	@Override
	public String getColor()
	{
		return "czerwony";
	}

}
