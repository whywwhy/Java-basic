public class CFruit {
    private String mName; //과일이름
    private int mCnt; //과일개수

    private int pCnt;

    public CFruit(String mName, int mCnt) {
        this.mName = mName;
        this.mCnt = mCnt;
    }
    //생성자 - 제일 처음 실행되는 메소드(함수)
    //시험
    //생성자의 이름은 클래스명과 같다!
    //return 타입 없다.

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmCnt() {
        return mCnt;
    }

    public void setmCnt(int mCnt) {
        this.mCnt = mCnt;
    }

    public void mShow(){
        System.out.println(String.format("과일이름 : %s 과일개수 : %d" ,this.mName, this.mCnt));
    }

    public void mBuy(int pCnt){
        this.mCnt = this.mCnt + pCnt;
        this.mShow();
    }

    public void mEat(int pCnt){
        this.mCnt = this.mCnt - pCnt;
        this.mShow();
    }
}
