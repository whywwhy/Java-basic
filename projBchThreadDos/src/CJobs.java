public class CJobs {
    static private int mJobNum = 0;
    //static이 붙으면 class 변수가 됨 <---> 인스턴스 변수(그냥 변수, 오브젝트변수 - new 필요)

    static public int mGetJobNum(){
        mJobNum++;
        return mJobNum;
    }
}
