public class Bag {
    // 현금
    private Long amount;
    // 초대장
    private Invitation invitation;
    // 티켓
    private Ticket ticket;

    public Bag(long amount)
    {
        this(null,amount);
    }

    public Bag(Invitation invitation,long amount)
    {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation()
    {
        // 초대장 보유 여부를 판단한다.
        return invitation != null;
    }

    public boolean hasTicket()
    {
        // 티켓 보유 여부를 판단.
        return ticket != null;
    }

    public void setTicket(Ticket ticket)
    {
        // 초대장을 티켓으로 교환
        this.ticket = ticket;
    }

    public void minusAmount(Long amount)
    {
        // 현금 감소 함수
        this.amount -= amount;
    }

    public void plusAmount(Long amount)
    {
        // 현금 증가 함수
        this.amount += amount;
    }

}
