package P19_AccessSpecifier;

public class TestAcessSpecifier {
    public static void main(String[] args) {
        AccessSpecifier ac=new AccessSpecifier();
        // ac.privateMethod();  //it does not acess from outside the class
        ac.protectedMethod();
        ac.defaultMethod();
        ac.publicMethod();
    }
}
