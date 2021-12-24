package imageeditor;

public class DrawTriangleCommand implements ICommand {
    private Canvas canvas;

    public DrawTriangleCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    public void execute() {
        this.canvas.drawTriangle();
    }

    public void undo() {
    	this.canvas.erase(this.canvas.getFigures().size() - 1);
    }
}
