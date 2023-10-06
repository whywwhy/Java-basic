module com.example.projbchdemo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.projbchdemo1 to javafx.fxml;
    exports com.example.projbchdemo1;
}