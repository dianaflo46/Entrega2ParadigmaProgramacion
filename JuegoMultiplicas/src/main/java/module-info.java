module com.mycompany.juegomultiplicas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.juegomultiplicas to javafx.fxml;
    exports com.mycompany.juegomultiplicas;
}
