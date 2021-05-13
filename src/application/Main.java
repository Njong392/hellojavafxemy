package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage stage) {
        Label label = new Label();
        label.setText("Hello World");
        VBox myFirstPane = new VBox();
        myFirstPane.getChildren().add(label);
        Scene myFirstScene = new Scene(myFirstPane);


        stage.setTitle("My first javafx project");
        stage.setWidth(600);
        stage.setHeight(400);
        stage.setScene(myFirstScene);
        stage.show();

    }
}