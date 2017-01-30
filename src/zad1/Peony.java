package zad1;

public class Peony extends Flowers
{

	protected Peony(int amount)
	{
		super(amount);
	}

	@Override
	public String getName()
	{
		return "piwonia";
	}

	@Override
	public String getColor()
	{
		return "czerwony";
	}

}
