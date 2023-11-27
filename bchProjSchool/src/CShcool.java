public class CShcool {
    protected String mNm; //학교명
    private String mAddr; //학교주소
    private String mBoss; //교장
    private int mCnt; //학생

    //생성자
    public CShcool(String mNm, String mAddr, String mBoss, int mCnt) {
        this.mNm = mNm;
        this.mAddr = mAddr;
        this.mBoss = mBoss;
        this.mCnt = mCnt;
    }

    public CShcool(CShcool pSch){
        this.mNm = pSch.mNm;
        this.mAddr = pSch.mAddr;
        this.mBoss = pSch.mBoss;
        this.mCnt = pSch.mCnt;
    }

    public String getmNm() {
        return mNm;
    }

    public void setmNm(String mNm) {
        this.mNm = mNm;
    }

    public String getmAddr() {
        return mAddr;
    }

    public void setmAddr(String mAddr) {
        this.mAddr = mAddr;
    }

    public String getmBoss() {
        return mBoss;
    }

    public void setmBoss(String mBoss) {
        this.mBoss = mBoss;
    }

    public int getmCnt() {
        return mCnt;
    }

    public void setmCnt(int mCnt) {
        this.mCnt = mCnt;
    }
    //mshow 학교명 주소 교장 학생수 출력(printf)
    public void mShow(){
        System.out.printf("학교명 : %s, 주소 : %s, 교장 : %s, 학생수 : %d ",
                this.mNm, this.mAddr, this.mBoss, this.mCnt);
        //println은 파라미터 없이 그대로 출력하는거라서 오류!!

    }
}