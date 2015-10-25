package gildedrose;

public class Acciones {

	public static void aumentarCualidad(Item item)
	{
		item.setQuality(item.getQuality() + 1);
	}
	
	public static void disminuirCualidad(Item item)
	{
		item.setQuality(item.getQuality() - 1);
	}
	public static void aumentarPrecio(Item item)
	{
		item.setSellIn(item.getSellIn() + 1);
	}
	public static void disminuirPrecio(Item item)
	{
		item.setSellIn(item.getSellIn() - 1);
	}
}
