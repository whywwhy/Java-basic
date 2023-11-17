public class CStudent extends CClass{
    String mName;
    int mNum;

    public CStudent(CClass pClass, String mName, int mNum) {
        super(pClass);
        this.mName = mName;
        this.mNum = mNum;
    }

    public void mShow(){
        super.mShow();
        System.out.println("학생정보 - 이름: "+this.mName+" 번호: "+this.mNum);
    }
}
