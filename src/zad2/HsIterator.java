package zad2;

import java.util.Iterator;

public class HsIterator implements Iterator<Integer>
{
	private int ini;
	private boolean nastepny;

	public HsIterator(int value)
	{
		this.ini = value;
		this.nastepny = true;
	}

	@Override
	public boolean hasNext()
	{
		return ini != 1;
	}

	@Override
	public Integer next()
	{
		if (nastepny)
		{
			nastepny = false;
			return ini;
		}

		int x;
		if ((x = ini % 2) == 0)
		{
			x = ini / 2;
		} else
			x = 3 * ini + 1;

		ini = x;
		return x;
	}

}
