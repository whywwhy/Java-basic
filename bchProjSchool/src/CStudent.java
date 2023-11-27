public class CStudent extends CClass{
    private String mStdnt; //학생이름
    private int mNum; //번호
    private String mMBTI; //mbti

    public CStudent(CShcool pSch, CClass pCls, String mStdnt, int mNum, String mMBTI) {
        //CShcool pSch, CClass pCls 부모를 위해서 넘겨받는 것
        //String mStdnt 자기 오브젝트 위해 넘겨받은것
        super(pSch, pCls);
        //부모의 생성자 호출되어 super
        this.mStdnt = mStdnt;
        this.mNum = mNum;
        this.mMBTI = mMBTI;
    }
//위어꺼 하면 다시 하나하나 다 쳐야하니까  밑에꺼 햇더!!
    public String getmStdnt() {
        return mStdnt;
    }

    public void setmStdnt(String mStdnt) {
        this.mStdnt = mStdnt;
    }

    public int getmNum() {
        return mNum;
    }

    public void setmNum(int mNum) {
        this.mNum = mNum;
    }

    public String getmMBTI() {
        return mMBTI;
    }

    public void setmMBTI(String mMBTI) {
        this.mMBTI = mMBTI;
    }

    public void mShow(){
        //조상내역
        super.mShow();
        //자기내역
        System.out.printf("학생이름: %s, 번호:%d, MBTI:%s \n",
                this.mStdnt, this.mNum, this.mMBTI
                );
    }
}
