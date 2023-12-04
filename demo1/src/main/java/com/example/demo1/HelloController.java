package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private CheckBox chkDinnr;

    @FXML
    private CheckBox chkLunch;

    @FXML
    private CheckBox chkMrn;

    @FXML
    private ComboBox<String> cmbCndtn;

    @FXML
    private DatePicker dtDate;

    @FXML
    private ListView<String> lvHistory;

    @FXML
    void onAddClick(ActionEvent event) {
        LocalDate lDate = this.dtDate.getValue();

        String lMedicine = (this.chkMrn.isSelected()) ? "[O]" : "[X]";
        lMedicine += (this.chkLunch.isSelected()) ? "[O]" : "[X]";
        lMedicine += (this.chkDinnr.isSelected()) ? "[O]" : "[X]";

        String lCondition = this.cmbCndtn.getValue();

        String lrow = String.format("%10s %20s %20s", lDate.toString(), lMedicine, lCondition);

        this.lvHistory.getItems().add(lrow);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.cmbCndtn.getItems().setAll("best", "so so", "bad");
        this.dtDate.setValue(LocalDate.now());
    }
}
