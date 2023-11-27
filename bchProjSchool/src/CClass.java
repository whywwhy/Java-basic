public class CClass extends CShcool{
    private int mGrade;
    private int mClass;
    private String mTeacher;

    public CClass(CShcool pSch, int mGrade, int mClass, String mTeacher) {
        super(pSch); //super 괄호는 부모 생성자 호출
        //(시험)super(pSch.mNm, pSch.getmAddr(), pSch.getmBoss(), pSch.getmCnt());
        this.mGrade = mGrade;
        this.mClass = mClass;
        this.mTeacher = mTeacher;
    }

    //생성자(학교 오브젝트, 반오브젝트)를 입력받아 초기화
    //생성자는 오브젝트를 만드는 것
    public CClass(CShcool pSch, CClass pCls){
        super(pSch);
        this.mGrade = pCls.mGrade;
        this.mClass = pCls.mClass;
        this.mTeacher= pCls.mTeacher;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getmClass() {
        return mClass;
    }

    public void setmClass(int mClass) {
        this.mClass = mClass;
    }

    public String getmTeacher() {
        return mTeacher;
    }

    public void setmTeacher(String mTeacher) {
        this.mTeacher = mTeacher;
    }

    public void mShow(){
        //부모참조
        super.mShow();
        System.out.printf("학년 : %d, 반 : %d, 담임쌤 : %s ",
                this.mGrade, this.mClass, this.mTeacher);
    }
}
