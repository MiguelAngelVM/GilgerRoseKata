package gildedrose;

public class NORMAL implements InterfaceProducto{

	@Override
	public void detallesDelProduto(Item item) {
		// TODO Auto-generated method stub
		if (item.getQuality() > 0) 
		{		
			item.setQuality(item.getQuality() - 1);				
		}
		item.setSellIn(item.getSellIn() - 1);

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
