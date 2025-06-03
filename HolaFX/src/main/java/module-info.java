module mx.edu.utez.holafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.holafx to javafx.fxml;
    exports mx.edu.utez.holafx;
}