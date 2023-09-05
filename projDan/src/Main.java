public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        CPeople objHwanwoong = new CPeople(null, null, "환웅", 500);
        //objHwanwoong.mShow();

        CPeople objWoonggirl = new CPeople(null, null, "웅녀", 520);
        //objWoonggirl.mShow();

        CPeople objDan = new CPeople(objHwanwoong, objWoonggirl, "단군", 600);
        //objDan.mShow();

        CPeople objBiseogapMo = new CPeople(null, null, "비서갑모", 520);

        CPeople objBiseogap = new CPeople(null, objBiseogapMo, "비서갑", 620);
        //objBiseogap.mShow();

        CPeople objBuroo = new CPeople(objDan, objBiseogap, "부루", 700);
        objBuroo.mShow();
        objBuroo.mShowMother();
    }
}