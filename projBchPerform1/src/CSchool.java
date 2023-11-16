public class CSchool {
    //학교 명 - 클래스 변수
    private static String mSchoolNm = "sw고";
    //학교주소 - 클래스 변수
    private static String mAddr = "대구시 달성군 구지면 창리로";
    //mshow - 자손들이 접근 가능하게 한다.
    void mShow(){
        //학교정보 - 학교명 : ? 주소 : ?
        System.out.println("학교정보 - 학교명: " + CSchool.mSchoolNm + " 주소: " + CSchool.mAddr);
        //학교 명은 class 변수라서 this 사용 ㅂ루가능
    }
}
