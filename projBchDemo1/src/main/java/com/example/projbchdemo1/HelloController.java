package com.example.projbchdemo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtC;



    @FXML
    void mAdd(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText()); //문자형을 숫자로
        int lb = Integer.valueOf(this.txtB.getText());

        String lResult = String.valueOf(la + lb);
        this.lblResult.setText(lResult);
//                디스는 자동으로 떠서 붙임

    }

    @FXML
    void mDiv(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText()); //문자형을 숫자로
        int lb = Integer.valueOf(this.txtB.getText());

        String lResult = String.valueOf(la / lb);
        this.lblResult.setText(lResult);
    }

    @FXML
    void mMult(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText()); //문자형을 숫자로
        int lb = Integer.valueOf(this.txtB.getText());

        String lResult = String.valueOf(la * lb);
        this.lblResult.setText(lResult);
    }

    @FXML
    void mSub(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText()); //문자형을 숫자로
        int lb = Integer.valueOf(this.txtB.getText());

        String lResult = String.valueOf(la - lb);
        this.lblResult.setText(lResult);
    }

    @FXML
    void mMax(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText()); //문자형을 숫자로
        int lb = Integer.valueOf(this.txtB.getText());
        int lc = Integer.valueOf(this.txtC.getText()); //문자형을 숫자로

        int lMax = la > lb ? (la > lc ? la : lc) : (lb > lc ? lb : lc);

        String lResult = String.valueOf(lMax);
        this.lblResult.setText(lResult);
    }

}
