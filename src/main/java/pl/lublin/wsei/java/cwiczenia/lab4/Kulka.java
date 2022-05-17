package pl.lublin.wsei.java.cwiczenia.lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Kulka {

//    private static final double R = 10;
    private double xSpeed;
    private double ySpeed;
    private double xPos;
    private double yPos;
    private double radius;
    private Color color;

    Kulka(double xPos, double yPos, double xSpeed, double ySpeed, double radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
        color = Color.WHITESMOKE;
    }

    Kulka(double xPos, double yPos, double xSpeed, double ySpeed, double radius, Color color) {
        this(xPos, yPos, xSpeed, ySpeed, radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void checkBoundaryCollision(double xLeft, double yTop, double xRight, double yBottom) {
        if ((xPos - radius <= xLeft) || (xPos + radius >= xRight)) {
            xSpeed = -xSpeed;
        }
        if ((yPos - radius <= yTop) || (yPos + radius >= yBottom)) {
            ySpeed = -ySpeed;
        }
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(xPos - radius, yPos - radius, 2 * radius, 2 * radius);
    }

    public void update() {
        xPos += xSpeed;
        yPos += ySpeed;
    }
}
