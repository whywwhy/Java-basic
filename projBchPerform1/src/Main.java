public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        try{
            //학교 정보 오브젝트 생성 생략 - 클래스 변수로 생성 했기 때문
            //학급정보 오브젝트 생성
            CClass obj14 = new CClass(1, 4, "조현아");


            //학생 1 정보 오브젝트 생성
            CStudent objtruefalse = new CStudent(obj14, "objtruefalse", 12);
            //학생 2 정보 오브젝트 생성
            CStudent objNull = new CStudent(obj14, "null", 0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}