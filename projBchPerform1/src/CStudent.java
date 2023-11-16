public class CStudent extends CClass{
    // 이름
    private String mName;
    // 번호
    private int nNum;
    //생성자(학급정보, 이름, 번호)

    public CStudent(CClass pCls, String mName, int nNum) {
        super(pCls);
        //부모의 생성자
        this.mName = mName;
        this.nNum = nNum;
        //생성시 자신의 정보 출력하낟.
        this.mShow();
    }

    //모든 객체에서 접극 가능하도록 한다. mshow
    public void mShow(){
        //학급 정보 출력
        super.mShow();

        //학생정보 - 이름 : ?, 번호 : ?
        System.out.println("학생정보 - 이름: " + this.mName + ", 번호: " + this.nNum);
    }

}
