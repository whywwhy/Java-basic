public class CJobs {
    static private int mJobNum = 0;
    //static이 붙으면 class 변수가 됨 <---> 인스턴스 변수(그냥 변수, 오브젝트변수 - new 필요)

    static synchronized public int mGetJobNum(){
        //synchronized영역 하나의 thread만 들어갈 수 있게 만ㄷ르어줌
        mJobNum++;
        try {
            Thread.sleep(500); //지연시키기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return mJobNum;
    }
}
