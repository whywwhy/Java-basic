public class CStudent extends CClass{
    private String mName;
    private int mNum;

    public CStudent(CClass pClass, String mName, int mNum) {
        super(pClass);
        this.mName = mName;
        this.mNum = mNum;
    }

    public void mShow(){
        super.mShow();
        System.out.println("학생정보 - 이름 : "+mName+" 학번 : "+mNum);
    }
}
