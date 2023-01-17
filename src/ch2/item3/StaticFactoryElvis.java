package ch2.item3;

public class StaticFactoryElvis {
    private static final StaticFactoryElvis INSTANCE = new StaticFactoryElvis();

    private StaticFactoryElvis() {
    }

    public static StaticFactoryElvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }


    public static void main(String[] args) {
        StaticFactoryElvis elvis = StaticFactoryElvis.getInstance();
        elvis.leaveTheBuilding();
    }
}
