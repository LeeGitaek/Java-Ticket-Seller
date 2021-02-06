public class Audience {
    // 관람객 클래스
    // 관람객은 소지품 보관을 위해 가방을 소지할 수 있다.
    private Bag bag;

    public Audience(Bag bag)
    {
        this.bag = bag;
    }

    public Bag getBag()
    {
        return bag;
    }
}
