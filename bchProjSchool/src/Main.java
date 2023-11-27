public class Main {
    //new에는 생성자 메소드 사용하기
    public static void main(String[] args){
        CShcool objSchool = new CShcool("대구소프트웨어마이스터고등학교", "구지면", "PYH", 203);

//        objSchool.mShow();

        CClass obj14 = new CClass(objSchool, 1, 4, "조현아");
                //obj14.mShow();
        CClass obj11 = new CClass(objSchool, 1, 1, "김창대");

        CClass obj13 = new CClass(objSchool, 1, 3, "이진주");

        CStudent objHojoon = new CStudent(objSchool, obj14, "김호준", 10, "ABCD");
        objHojoon.mShow();

        CStudent objGayoung = new CStudent(objSchool, obj11, "김가영", 2, "QWER");
        objGayoung.mShow();

        CStudent objSua = new CStudent(objSchool, obj13, "김수아", 1, "ASDF");
        objSua.mShow();
    }
}