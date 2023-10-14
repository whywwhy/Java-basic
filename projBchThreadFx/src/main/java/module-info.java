module com.example.projbchthreadfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.projbchthreadfx to javafx.fxml;
    exports com.example.projbchthreadfx;
}