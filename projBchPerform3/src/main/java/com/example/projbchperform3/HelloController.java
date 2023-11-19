package com.example.projbchperform3;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ListView<String> lvHistory;

    @FXML
    private ListView<String> lvJobQ;

    @FXML
    private TextField txtJob;

    @FXML
    void onAddClick(ActionEvent event) {
        //해야할 일을 변수에 넣어준다
        String lJob = this.txtJob.getText();
        //값이 있을 때 서버에 등록한다.
        if(lJob.length() > 0){
            CServer objServer = new CServer();
            objServer.mSend(lJob);
            //등록된 해야할 일들을 화면에 뿌려준다.
            this.lvJobQ.getItems().setAll(CServer.mJobQ);
        }
        else{
            Alert objAlert = new Alert(Alert.AlertType.WARNING, "해야할 일 입력해!!", ButtonType.CLOSE);
            objAlert.showAndWait();
        }
        //없으면 오류 메세지
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // 스레드 정의하기
        Thread th1 = new Thread(()->{
            //서버 오브젝트 생성
            CServer objServer = new CServer();
            //계속 반복
            while(true){
                //일 하나 가져와서 변수에 넣는다.
                String lJob = objServer.mReceive();
                //일이 존재하면
                if(lJob.length() > 0){
                    Platform.runLater(()->{
                        //한 일 목록 일을 추가
                        this.lvHistory.getItems().add(lJob);
                        //해야 할 일 목록도 갱신한다.
                        this.lvJobQ.getItems().setAll(objServer.mJobQ);
                    });
                }
                //2초 잔다.
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }); // 이름 없는건 람다 방식
        // 스레드 이름 주기
        th1.setName("호준스레드");
        // 스레드 일 시작하기
        th1.start();
    }
}
