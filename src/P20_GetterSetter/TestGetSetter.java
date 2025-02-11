package P20_GetterSetter;

public class TestGetSetter {
    public static void main(String[] args) {
        GetterSetter P1 = new GetterSetter();
        P1.setName("Vaishali");
        P1.setpCity("Solapur");
        System.out.println(P1);
        GetterSetter P2 = new GetterSetter("Sneha", "Pune");
        System.out.println(P2);
    }
}
