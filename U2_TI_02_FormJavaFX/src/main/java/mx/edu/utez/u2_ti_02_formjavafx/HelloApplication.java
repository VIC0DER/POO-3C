package mx.edu.utez.u2_ti_02_formjavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        TextField tfName = new TextField();
        TextField tfAge = new TextField();
        ObservableList<String> options = FXCollections.observableArrayList("Student", "Professor", "Admin");
        ComboBox<String> cbRole = new ComboBox<>(options);
        Button btnCreate = new Button("Create");
        Label lblResult = new Label();
        GridPane form = new GridPane();

        tfName.setPromptText("Your name");
        tfAge.setPromptText("Your age");
        cbRole.setPromptText("Your role");

        btnCreate.setOnAction(e -> {
            String name = tfName.getText();
            String age = tfAge.getText();
            String role = cbRole.getSelectionModel().getSelectedItem();

            if(name == null || age == null || role == null){
                lblResult.setText("All fields are required");
            }else{
                lblResult.setText("Hi " + name + ", you are a " + role + " and you are " + age + " years old");
            }
            form.setStyle("-fx-background-color: #075a13");
            lblResult.setStyle("-fx-background-color: #5bbf69");
        });

        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);
        form.add(tfName, 0, 0);
        form.add(tfAge, 0, 1);
        form.add(cbRole, 0, 2);
        form.add(btnCreate, 0, 3);
        form.add(lblResult, 0, 4);

        Scene scene = new Scene(form, 700, 500);
        stage.setTitle("Form JavaFX");
        Image image = new Image(getClass().getResourceAsStream("/Icons/shuttle_2285485.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}