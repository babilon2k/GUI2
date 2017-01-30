
package zad1;

import java.util.ArrayList;

public class ShoppingCart
{

	private ArrayList<Flowers> flowers;
	private String owner;

	public ShoppingCart(String owner)
	{
		flowers = new ArrayList<>();
		this.owner = owner;
	}

	public void add(Flowers flower)
	{
		flowers.add(flower);
	}

	Flowers[] getItems()
	{
		return flowers.toArray(new Flowers[flowers.size()]);
	}

	public void remove(Flowers flower)
	{
		flowers.remove(flower);
	}

	public void clear()
	{
		flowers.clear();
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Wózek właściciel " + owner);
		if (flowers.size() == 0)
		{
			sb.append(" -- pusto\n");
		} else
		{
			sb.append("\n");
		}
		for (int i = 0; i < flowers.size(); i++)
		{
			sb.append(flowers.get(i).toString());
			if (i != flowers.size() - 1)
				sb.append("\n");
		}
		return sb.toString();
	}
}
