package com.example.projbchperform2;

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
    private CheckBox chkMorning;

    @FXML
    private CheckBox chkNight;

    @FXML
    private CheckBox chkNoon;

    @FXML
    private ComboBox<String> cmbCondition;

    @FXML
    private DatePicker dtDate;

    @FXML
    private ListView<String> lvHistory;

    @FXML
    void onAddClick(ActionEvent event) {
        //선택 날짜 가져오
        String lDate = this.dtDate.getValue().toString();
        //약 복용 여부 가져오기
        String lMedicine = this.chkMorning.isSelected()?"[O]":"[X]";
        lMedicine = lMedicine + (this.chkNoon.isSelected()?"[O]":"[X]");
//        lMedicine += (this.chkNoon.isSelected()?"[O]":"[X]");
        lMedicine = lMedicine + (this.chkNight.isSelected()?"[O]":"[X]");

        //오늘의 컨디션 가져오
        String lCondition = this.cmbCondition.getValue();

        //한 줄 만들기
        String lRow = String.format("%10s %20s %10s", lDate, lMedicine, lCondition);

        //한 줄을 리스트뷰에 넣어주기
        this.lvHistory.getItems().add(lRow);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //오늘의 날짜 설정하기
        this.dtDate.setValue(LocalDate.now());

        //콤버박스 초기 내용 설정
        this.cmbCondition.getItems().setAll("best", "so so", "bad");
    }
}
