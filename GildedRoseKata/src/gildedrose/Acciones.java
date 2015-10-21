package gildedrose;

public class Acciones {

	public static void agregarCualidad(Item item, boolean signo, int cantidad)
	{
		if(signo == true)
		item.setQuality(item.getQuality() + cantidad);
		else	
			item.setQuality(item.getQuality() - cantidad);
	}
}
