package imageeditor;

public class Client {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		
		ICommand drawCircleCommand = new DrawCircleCommand(canvas);
		ICommand drawSquareCommand = new DrawSquareCommand(canvas);
		ICommand drawTriangleCommand = new DrawTriangleCommand(canvas);
		
		Drawer drawer = new Drawer(drawCircleCommand, drawSquareCommand, drawTriangleCommand);
		
		drawer.drawCircle();
		drawer.drawSquare();
		drawer.drawTriangle();
		drawer.drawSquare();
		drawer.drawCircle();
		drawer.drawTriangle();
		
		drawer.undo();
		drawer.undo();
		drawer.undo();
		drawer.undo();
		drawer.undo();
		drawer.undo();
		drawer.undo();
		drawer.undo();
	}
}
