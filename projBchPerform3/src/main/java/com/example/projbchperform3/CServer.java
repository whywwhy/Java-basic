package com.example.projbchperform3;

import java.util.ArrayList;
import java.util.List;

public class CServer implements IServer{
    //jobQ 클래스변수 추가
    public static List<String> mJobQ = new ArrayList<>();
    @Override
    public void mSend(String pJob) {
        // 입력한 작업을 jobQ에 추가한다.
        //this는 오브젝트 변수라서, static이 생겨 클래스 변수인 mJobQ를 불러올 수 엇ㅂ사
        CServer.mJobQ.add(pJob);
    }

    @Override
    public String mReceive() {
        //일거리 하나 넘겨주기
        if(CServer.mJobQ.size() > 0) {
            return CServer.mJobQ.remove(0);
        }
        else
            //자료가 해야 할 일이 없을 때 공백을 넘겨준다.
            return "";
    }
}
