package gildedrose;

public  class IniciarCiclo implements Command{
	private InterfaceProducto interfaceProducto;
	
	public IniciarCiclo(InterfaceProducto interfaceProducto)
	{
		this.interfaceProducto = interfaceProducto;
	}
	@Override
	public void execute(Item item) {
		// TODO Auto-generated method stub
		interfaceProducto.detallesDelProduto(item);
	}


}
