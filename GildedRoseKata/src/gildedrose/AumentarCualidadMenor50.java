package gildedrose;

public class AumentarCualidadMenor50 {
	public static void dismiuirCualidad(Item item)
	{
		if (item.getQuality() < 50)
		{
			item.setQuality(item.getQuality() + 1);
			
		}
	}
}
