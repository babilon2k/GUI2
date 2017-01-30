package zad1;

public class Lilac extends Flowers
{

	protected Lilac(int amount)
	{
		super(amount);
	}

	@Override
	public String getName()
	{
		return "bez";
	}

	@Override
	public String getColor()
	{
		return "biały";
	}
}
