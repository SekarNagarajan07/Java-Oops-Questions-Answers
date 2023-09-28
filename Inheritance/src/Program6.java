class FrequentFlyerMember{
    private String name;
    private int membershipNumber;

    public FrequentFlyerMember(String name, int membershipNumber) {
        this.name = name;
        this.membershipNumber = membershipNumber;
    }

    public void accessWaitingRoom(){
        System.out.println(name + " is accessing the waiting room");

    }

    public String getName(){
        return name;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }
}

class PlatinumMemeber extends FrequentFlyerMember{
    public PlatinumMemeber(String name, int membershipNumber) {
        super(name, membershipNumber);
    }

    public void accessLounge(){
        System.out.println(getName() + "is accessing the lounge");
    }
}

class GoldMember extends FrequentFlyerMember {
    public GoldMember(String name, int membershipNumber) {
        super(name, membershipNumber);
    }
}
class Program6 {
    public static void main(String[] args) {
        PlatinumMemeber platinumMemeber = new PlatinumMemeber("sekar",123);
        platinumMemeber.accessWaitingRoom();
        platinumMemeber.accessLounge();

        GoldMember goldMember = new GoldMember("kannan",12);
        goldMember.accessWaitingRoom();

    }
}