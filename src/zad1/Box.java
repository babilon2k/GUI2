package zad1;

import java.util.ArrayList;

public class Box
{

	private String owner;
	private ArrayList<Flowers> flowers;

	public Box(Customer customer)
	{
		super();
		flowers = new ArrayList<>();
		this.owner = customer.getName();
	}
	public void pack(Flowers[] items)
	{
		for (Flowers item : items)
		{
			flowers.add(item);
		}
	}
	public double getPriceByColor(String color)
	{
		PriceList priceList = PriceList.getInstance();
		double result = 0.0;
		for (Flowers flower : flowers)
		{
			if (flower.getColor().equals(color))
			{
				double price = priceList.getPrice(flower.getName())
						* flower.getCount();
				result += price;
			}
		}
		return result;
	}
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Pudełko właściciel " + owner + "\n");
		for (int i = 0; i < flowers.size(); i++)
		{
			sb.append(flowers.get(i).toString());
			if (i != flowers.size() - 1)
				sb.append("\n");
		}
		return sb.toString();
	}
}
