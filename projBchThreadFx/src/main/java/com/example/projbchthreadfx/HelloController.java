package com.example.projbchthreadfx;

import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class HelloController {

    @FXML
    private ListView<String> lvJobs;

    @FXML
    private ListView<String> lvJobsWrk1;

    @FXML
    private ListView<String> lvJobsWrk2;

    @FXML
    private ListView<String> lvJobsWrk3;

    @FXML
    private TextField txtJobNm;

    @FXML
    void mAddJob(ActionEvent event) {
        CJobs.mGetJobNum(this.txtJobNm.getText());
        this.mShowList(CJobs.mArrJobsQ, this.lvJobs);
    }

    @FXML
    void mWork1(ActionEvent event) {
        CWorker objWorker1 = new CWorker("가영");
        //스레드
        Thread th1 = new Thread(()->{
            objWorker1.mWork();
            this.mShowList(objWorker1.mJobHistory, this.lvJobsWrk1);
            this.mShowList(CJobs.mArrJobsQ, this.lvJobs);

            while(objWorker1.mJobHistory.size() < objWorker1.MAXJOBCNT) {
                objWorker1.mWork();

                this.mShowList(objWorker1.mJobHistory, this.lvJobsWrk1);
                this.mShowList(CJobs.mArrJobsQ, this.lvJobs);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th1.setName("가영스레드");
        th1.start();
    }

    @FXML
    void mWork2(ActionEvent event) {
        CWorker objWorker2 = new CWorker("성은");
        //스레드
        Thread th2 = new Thread(()->{
            objWorker2.mWork();
            this.mShowList(objWorker2.mJobHistory, this.lvJobsWrk2);
            this.mShowList(CJobs.mArrJobsQ, this.lvJobs);

            while(objWorker2.mJobHistory.size() < objWorker2.MAXJOBCNT) {
                objWorker2.mWork();

                this.mShowList(objWorker2.mJobHistory, this.lvJobsWrk2);
                this.mShowList(CJobs.mArrJobsQ, this.lvJobs);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th2.setName("성은스레드");
        th2.start();

    }

    @FXML
    void mWork3(ActionEvent event) {
        CWorker objWorker3 = new CWorker("성은");
        //스레드
        Thread th3= new Thread(()->{
            objWorker3.mWork();
            this.mShowList(objWorker3.mJobHistory, this.lvJobsWrk3);
            this.mShowList(CJobs.mArrJobsQ, this.lvJobs);

            while(objWorker3.mJobHistory.size() < objWorker3.MAXJOBCNT) {
                objWorker3.mWork();

                this.mShowList(objWorker3.mJobHistory, this.lvJobsWrk3);
                this.mShowList(CJobs.mArrJobsQ, this.lvJobs);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);

                }
            }
        });
        th3.setName("성은스레드");
        th3.start();

    }

    void mShowList(List<String> pArrSrc, ListView pLv){
        Platform.runLater(()->{
            ObservableList lObsLst = pLv.getItems();
            lObsLst.setAll(pArrSrc);
            pLv.setItems(lObsLst);
        });
    }

}
