package zad1;

import java.text.DecimalFormat;

public abstract class Flowers
{

	protected int amount;

	public Flowers()
	{
	}

	public Flowers(int amount)
	{
		this.amount = amount;
	}

	public Flowers(String name, String color)
	{
	}

	public int getCount()
	{
		return this.amount;
	}

	public abstract String getName();
	public abstract String getColor();

	@Override
	public String toString()
	{
		PriceList priceList = PriceList.getInstance();
		double price = priceList.getPrice(getName());
		DecimalFormat df = new DecimalFormat("#.0");
		return getName() + ", kolor: " + getColor() + ", ilość " + amount
				+ ", cena " + df.format(price);
	}

}
