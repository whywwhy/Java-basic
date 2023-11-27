public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        CBird objEagle = new CBird("독수리");
        objEagle.mFly();

        CBird objKiwibird = new CBird("키위새");
        objKiwibird.mFly();

        //

        CFish objNimo = new CFish("흰동가리");
        objNimo.mSwim();

        CFish objDori = new CFish("블루탱");
        objDori.mSwim();

        //

        CDuck objGorapaduck = new CDuck("고라파덕");
        objGorapaduck.mFly();
        objGorapaduck.mSwim();
🥰
        CDuck objPaduck = new CDuck("파오리");
        objPaduck.mFly();
        objPaduck.mSwim();
    }

}