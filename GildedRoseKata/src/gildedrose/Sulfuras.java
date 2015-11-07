package gildedrose;

public class Sulfuras implements InterfaceProducto{

	@Override
	public void detallesDelProduto(Item item) {
		// TODO Auto-generated method stub
		AumentarCualidadMenor50.dismiuirCualidad(item);
		if (item.getSellIn() < 0) 
		{
			if (item.getQuality() > 0 && item.getQuality() != 80) 
			{							
				item.setQuality(item.getQuality() - 1);					
			}
			if (item.getQuality() > 0 && item.getQuality() != 80 && item.getName().equals("Conjured Mana Cake") && item.getQuality() > 0)
			{							
				item.setQuality(item.getQuality() - 1);			
			}			 
		}	
	}

}
