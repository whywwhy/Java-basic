public class CClass extends CSchool{
    private int mGrade;
    private int mClass;
    private String mTeacher;

    public CClass(int mGrade, int mClass, String mTeacher) {
        this.mGrade = mGrade;
        this.mClass = mClass;
        this.mTeacher = mTeacher;
    }

    public CClass(CClass pClass){
        this(pClass.mGrade, pClass.mClass, pClass.mTeacher);
    }

    protected void mShow(){
        super.mShow();
        System.out.println("학급정보 - 학년: "+this.mGrade+" 반: "+this.mClass+" 담임: "+this.mTeacher);
    }
}
