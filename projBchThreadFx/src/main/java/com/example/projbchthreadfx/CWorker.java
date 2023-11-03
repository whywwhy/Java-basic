package com.example.projbchthreadfx;

import java.util.ArrayList;
import java.util.List;

public class CWorker {
    String mWorkerNm;
    public final int MAXJOBCNT = 10;
    List<String> mJobHistory = new ArrayList<>();
//    ㅌㅏ입을 유연하게 하기 위해 : 프로그래먹 잘 수 잇게 하기 위행

    public CWorker(String mWorkerNm) {
        this.mWorkerNm = mWorkerNm;
    }

    public void mWork(){
        String lJob = CJobs.mGetJob();
        this.mJobHistory.add(lJob);
    }
}
