public interface IShape {
    double mArea();
    // public abstract 생략 되어잇음
    //넒이를 계산한다.

    static double mDiffer(IShape pObj1, IShape pObj2){
        // static 메소드느 ㄴ 선배가 구현함
        //인터페이스 이름. static 메서드는 오브젝트 없이 바로 쓸 수 있다.
        //인터페이스이름.메서드() 바로 사용됨.
        return pObj1.mArea() - pObj2.mArea();
    }


    // 두 도형의 차이을 return 한다.
}
