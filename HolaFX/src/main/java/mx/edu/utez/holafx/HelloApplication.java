package mx.edu.utez.holafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label myLabel = new Label("Hello World!");
        StackPane root = new StackPane(myLabel);
        Scene scene = new Scene(root, 200, 200);
        stage.setTitle("My first JavaFX Application");
        Image image = new Image(getClass().getResourceAsStream("/Icons/shuttle_2285485.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}