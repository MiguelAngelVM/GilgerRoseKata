package gildedrose;

public class AgedBrie implements InterfaceProducto {

	@Override
	public void aumentarCualidad(Item item) {
		// TODO Auto-generated method stub
		item.setQuality(item.getQuality() + 1);
	}
	@Override
	public void aumentarPrecio(Item item) {
		// TODO Auto-generated method stub
		item.setSellIn(item.getSellIn() + 1);
	}
	@Override
	public void disminuirCualidad(Item item) {
		// TODO Auto-generated method stub
		item.setQuality(item.getQuality() - 1);
	}

	@Override
	public void disminuirPrecio(Item item) {
		// TODO Auto-generated method stub
		item.setSellIn(item.getSellIn() - 1);
	}

}
