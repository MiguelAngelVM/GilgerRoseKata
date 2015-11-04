package gildedrose;

public class AumentoPrecio {
	public static void aumentarPrecio(Item item)
	{
		item.setSellIn(item.getSellIn() + 1);
	}
}
