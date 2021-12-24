package imageeditor;

public class DrawSquareCommand implements ICommand {
    private Canvas canvas;

    public DrawSquareCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    public void execute() {
        this.canvas.drawSquare();
    }

    public void undo() {
    	this.canvas.erase(this.canvas.getFigures().size() - 1);
    }
}
