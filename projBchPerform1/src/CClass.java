public class CClass extends CSchool{
    //학년
    private int mGrade;
    // 반
    private int mClass;
    //담임
    private String mTeacher;

    //생성자 1(학년 반 담임)

    public CClass(int mGrade, int mClass, String mTeacher) {
        this.mGrade = mGrade;
        this.mClass = mClass;
        this.mTeacher = mTeacher;
    }

    //생성자 2(학급정보오브젝트)

    public CClass(CClass pCls) {
        //this(): 셍성자
        this(pCls.mGrade, pCls.mClass, pCls.mTeacher);
    }


    //mshow
    void mShow(){
        //학교 정보 출력 --- > 부모(super)의 mshow 호출
        super.mShow();

        //학급 정보 출력 : 학급정보 - 학년 : ?, 반 : ?, 담임 : ?
        System.out.println("학급정보 - 학년: " + this.mGrade + ", 반: " + this.mClass + ", 담임: " + this.mTeacher);
    }
}
