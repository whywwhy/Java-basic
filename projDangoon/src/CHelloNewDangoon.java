public class CHelloNewDangoon {
    private String mName; //환웅이름
    private int mCnt; //과일개수

    public CHelloNewDangoon(String mName, int mCnt) {
        this.mName = mName;
        this.mCnt = mCnt;
    }

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
        System.out.println(String.format("이름 : %s / 나이 : %s" ,this.mName, this.mCnt));
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
