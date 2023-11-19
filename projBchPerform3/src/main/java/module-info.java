module com.example.projbchperform3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.projbchperform3 to javafx.fxml;
    exports com.example.projbchperform3;
}