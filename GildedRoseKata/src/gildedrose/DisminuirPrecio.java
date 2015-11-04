package gildedrose;

public class DisminuirPrecio {

	public static void disminuirPrecio(Item item)
	{
		item.setSellIn(item.getSellIn() - 1);
	}
}
