module com.example.projbchperform2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.projbchperform2 to javafx.fxml;
    exports com.example.projbchperform2;
}