package zad2;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer>
{
	private int ini;

	public Hailstone(int ini)
	{
		this.ini = ini;
	}

	@Override
	public Iterator<Integer> iterator()
	{
		return new HsIterator(ini);
	}

}
