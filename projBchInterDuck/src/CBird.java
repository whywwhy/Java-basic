public class CBird implements IFly{
    String mName;

    @Override
    public void mFly() {
        System.out.println(this.mName+" can "+IFly.mMove);
    }

    public CBird(String mName) {
        this.mName = mName;
    }
}
