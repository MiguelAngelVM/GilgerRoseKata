package gildedrose;

public class DisminucionCualidades {
	public static void disminuirCualidad(Item item)
	{
		item.setQuality(item.getQuality() - 1);
	}
}
