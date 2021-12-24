package imageeditor;

import java.util.ArrayList;

public class Canvas {
    private ArrayList<Figure> figures;

    public Canvas() {
    	this.figures = new ArrayList<Figure>();
    }
    
    public void drawCircle() {
    	System.out.println("Desenhando circulo!");
    	this.figures.add(new Figure("Circulo"));
    }

    public void drawSquare() {
    	System.out.println("Desenhando quadrado!");
    	this.figures.add(new Figure("Quadrado"));
    }

    public void drawTriangle() {
    	System.out.println("Desenhando triangulo!");
    	this.figures.add(new Figure("Triangulo"));
    }

    public void erase(int index) {
    	System.out.println("Apagando " + this.figures.get(index).getName() + "!");
    	this.figures.remove(index);
    }

    public ArrayList<Figure> getFigures() {
        return this.figures;
    }
}
