package ch2.item3;

public class FieldElvis {
    public static final FieldElvis INSTANCE = new FieldElvis();

    private FieldElvis(){}

    public void leaveTheBuilding(){
        System.out.println("난 여기 있어");
    }

    //보통 바깥 클래스에 작성
    public static void main(String[] args) {
        FieldElvis elvis = FieldElvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
