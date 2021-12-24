package imageeditor;

public class DrawCircleCommand implements ICommand {
    private Canvas canvas;

    public DrawCircleCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    public void execute() {
        this.canvas.drawCircle();
    }

    public void undo() {
        this.canvas.erase(this.canvas.getFigures().size() - 1);
    }
}
