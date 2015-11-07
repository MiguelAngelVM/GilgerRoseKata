package gildedrose;

import java.util.List;

public class GildedRose {
	Command command;
	Invoke invoke;
	public void updateQuality(List<Item> items) {
		for (final Item item : items) {
			
			switch (item.getName()) {
			
			case "Aged Brie":
				 command  = new IniciarCiclo(new AgedBrie());
				 invoke = new Invoke(command);
				 invoke.run(item);
				break;	
			
			case "Backstage passes to a TAFKAL80ETC concert":
				 command  = new IniciarCiclo(new Backstage());
				 invoke = new Invoke(command);
				 invoke.run(item);
				break;
				
			case "Sulfuras, Hand of Ragnaros":
				 command  = new IniciarCiclo(new Sulfuras());
				 invoke = new Invoke(command);
				 invoke.run(item);
				break;
			
			case "Conjured Mana Cake":
				 command  = new IniciarCiclo(new Conjured());
				 invoke = new Invoke(command);
				 invoke.run(item);
				break;
			
			case "NORMAL ITEM":
				 command  = new IniciarCiclo(new NORMAL());
				 invoke = new Invoke(command);
				 invoke.run(item);
				break;
		
				
			}
				
				
			
			
			
			
			
				
		
		}		
	}
}
