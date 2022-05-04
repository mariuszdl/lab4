package pl.lublin.wsei.java.cwiczenia.lab4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Pong1 extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        stage.setTitle("Kulki");
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();

        gc.setFill(Color.BLACK);
        gc.fillRect(50, 50, 700, 500);
    }

    public static void main(String[] args) {
        launch();
    }
}