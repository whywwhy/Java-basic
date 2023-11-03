public class CPig implements IAnimal{

    String mNm = "돼지";

    @Override
    public void mEat() {
        System.out.println(this.mNm + "먹이 : 돼지감자, 지렁이, 도토리");

    }

    @Override
    public void mCry() {
        System.out.println(this.mNm + "울음소리 : 꿀, 꿀꿀, 꿀꿀꿀");

    }
}
