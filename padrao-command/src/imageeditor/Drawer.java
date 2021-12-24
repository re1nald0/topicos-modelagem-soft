package imageeditor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Drawer {
	private Map<String, ICommand> commands;
	private ArrayList<ICommand> executedCommands;
	
	public Drawer(ICommand drawCircleCommand, ICommand drawSquareCommand, ICommand drawTriangleCommand) {
		this.commands = new HashMap<String, ICommand>();
		this.executedCommands = new ArrayList<ICommand>();
		this.commands.put("DrawCircle", drawCircleCommand);
		this.commands.put("DrawSquare", drawSquareCommand);
		this.commands.put("DrawTriangle", drawTriangleCommand);
	}
	
	public void drawCircle() {
		this.commands.get("DrawCircle").execute();
		this.executedCommands.add(this.commands.get("DrawCircle"));
	}
	
	public void drawSquare() {
		this.commands.get("DrawSquare").execute();
		this.executedCommands.add(this.commands.get("DrawSquare"));
	}
	
	public void drawTriangle() {
		this.commands.get("DrawTriangle").execute();
		this.executedCommands.add(this.commands.get("DrawTriangle"));
	}
	
	public void undo() {
		if(!this.executedCommands.isEmpty()) {
			this.executedCommands.get(this.executedCommands.size() - 1).undo();
			this.executedCommands.remove(this.executedCommands.size() - 1);
		} else {
			System.out.println("Nao ha nada para desfazer.");
		}
	}
}
