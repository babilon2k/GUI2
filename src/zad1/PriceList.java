package zad1;

import java.util.HashMap;

public class PriceList
{
	private static PriceList instance;
	private HashMap<String, Double> prices;

	private PriceList()
	{
		prices = new HashMap<>();
	}

	public static PriceList getInstance()
	{
		if (instance == null)
		{
			synchronized (PriceList.class)
			{
				if (instance == null)
					instance = new PriceList();
			}
		}

		return instance;
	}

	public void put(String flowerName, double p)
	{
		prices.put(flowerName, p);
	}

	public double getPrice(String name)
	{
		if (prices.containsKey(name))
		{
			return prices.get(name);
		}
		return -1;
	}

}
