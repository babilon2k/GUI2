package zad1;

public class Customer
{
	private String name;
	private double money;
	private ShoppingCart shoppingCart;

	public Customer(String name, double money)
	{
		this.name = name;
		this.money = money;
		this.shoppingCart = new ShoppingCart(name);
	}

	public void pay()
	{
		PriceList priceList = PriceList.getInstance();
		for (Flowers flowers : shoppingCart.getItems())
		{
			double price = priceList.getPrice(flowers.getName())
					* flowers.getCount();
			if (price >= 0 && money >= price)
			{
				money -= price;
			} else
			{
				shoppingCart.remove(flowers);
			}
		}
	}

	public ShoppingCart getShoppingCart()
	{
		return shoppingCart;
	}

	public void pack(Box box)
	{
		box.pack(shoppingCart.getItems());
		shoppingCart.clear();
	}
	public double getCash()
	{
		return money;
	}
	public void get(Flowers f)
	{
		shoppingCart.add(f);
	}

	public String getName()
	{
		return name;
	}

}
