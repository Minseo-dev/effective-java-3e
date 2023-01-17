package ch2.item3;

public enum EnumTypeElvis {
    INSTANCE;

    public void leaveTheBuilding(){
        System.out.println("나 지금 가!!!");
    }

    //다른 클래스에 작성 필요
    public static void main(String[] args) {
        EnumTypeElvis elvis = EnumTypeElvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
