package gildedrose;

public class AgedBrie implements InterfaceProducto {

	@Override
	public void detallesDelProduto(Item item) {
		// TODO Auto-generated method stub
		AumentarCualidadMenor50.dismiuirCualidad(item);
		item.setSellIn(item.getSellIn() - 1);
		if (item.getQuality() < 50 && item.getSellIn() < 0)
		{
			item.setQuality(item.getQuality() + 1);
		}
	}

	

}
