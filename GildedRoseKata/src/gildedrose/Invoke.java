package gildedrose;

public class Invoke {
	private Command command;


	public Invoke(Command command)
	{
		this.command = command;
	}

	
	public void run(Item item) {
		// TODO Auto-generated method stub
		command.execute(item);
	}
}
