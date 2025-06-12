package mx.edu.utez.holafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lblNombre = new Label("Nombre:");
        Label lblComentario = new Label("Comentario");
        Label lblOpciones = new Label("Opciones");
        Label lblResultado = new Label();
        TextField tfNombre = new TextField();
        TextArea tfComentario = new TextArea();
        ObservableList<String> opciones = FXCollections.observableArrayList("A", "B", "C");
        ComboBox<String> comboOpciones = new ComboBox<>(opciones);
        Button btnAceptar = new Button("Aceptar");

        btnAceptar.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String comentario = tfComentario.getText();
            String seleccion = comboOpciones.getSelectionModel().getSelectedItem();
            if(seleccion == null || nombre == null || comentario == null) {
                System.out.println("Todos los campos son obligatorios");
                lblResultado.setText("Todos los campos son obligatorios");
            }else{
                lblResultado.setText("Nombre: " + nombre + "\nComentario: " + comentario + "\nOpciones: " + seleccion);
            }
        });

        //StackPane root = new StackPane(myLabel);
        //VBox root = new VBox(30, lblResultado, btnAceptar, btnCancelar);
        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);
        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblComentario, 0, 1);
        form.add(tfComentario, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(comboOpciones, 1, 2);
        form.add(btnAceptar, 0, 3);
        form.add(lblResultado, 0, 4);
        //root.setPadding(new Insets(20));

        Scene scene = new Scene(form, 700, 700);

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