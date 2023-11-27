public class CFish implements ISwim{
    String mName;
    //object이름

    @Override
    public void mSwim() {
        System.out.println(this.mName+" can "+mMove);
    }

    public CFish(String mName) {
        this.mName = mName;
    }
}
