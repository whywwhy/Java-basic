public class Main {
    public static void main(String[] args) {
        try{
            CClass objCls = new CClass(1, 4, "조현아");
            CStudent obj14 = new CStudent(objCls, "배채희", 3);
            obj14.mShow();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}