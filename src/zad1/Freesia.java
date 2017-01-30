package zad1;

public class Freesia extends Flowers
{

	protected Freesia(int amount)
	{
		super(amount);
	}

	@Override
	public String getName()
	{
		return "frezja";
	}

	@Override
	public String getColor()
	{
		return "żółty";
	}

}
