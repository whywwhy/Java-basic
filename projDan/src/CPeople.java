public class CPeople {
    private CPeople mFather;

    private CPeople mMother;

    private String mMyName;

    private int mLifeSpan;

    public CPeople(CPeople mFather, CPeople mMother, String mMyName, int mLiftSpan) {
        this.mFather = mFather;
        this.mMother = mMother;
        this.mMyName = mMyName;
        this.mLifeSpan = mLiftSpan;
    }
//    생성자

    public void mShow(){
        if (mFather != null)
            //자기 조상 찍으러 가야 함
            this.mFather.mShow(); //조상들 먼저 찍기
        //어ㅏ빠 호출, 아빠의 아빠

        //돌려 줄 필요 없을 때 void
        System.out.println(String.format("아빠이름 : %s / 엄마이름 : %s / 자기 이름 : %s / 나이 : %d",
                (this.mFather==null)?"":this.mFather.mMyName,
                (this.mMother==null)?"":this.mMother.mMyName,
                this.mMyName, this.mLifeSpan));
        //삼합 연산자 (==) ? : -> 무릉ㅁ표 앞에 조건, 조건이 참이면 물음표 뒤에 실행, 아니면 콜론 뒤 실행

    }
    public void mShowMother(){
        System.out.println(String.format("아빠이름 : %s / 엄마이름 : %s / 자기 이름 : %s / 나이 : %d",
                (this.mFather==null)?"":this.mFather.mMyName,
                (this.mMother==null)?"":this.mMother.mMyName,
                this.mMyName, this.mLifeSpan)
        );

        if (mMother != null)
            this.mMother.mShowMother();
    }
}
