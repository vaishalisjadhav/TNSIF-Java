public class Type_Conversion_Casting {
    public static void main(String[] args) {
        //implicit
        long big=45;
        float dec=3;
        double d=3.4f;
        System.out.println(big);
        System.out.println(dec);
        System.out.println(d);

        //explicit
        long eBig=(long) 3.4;
        float eDec=(float) 3.4;
        int eInt=(int) 3.4;
        System.out.println(eBig);
        System.out.println(eDec);
        System.out.println(eInt);
    }
}
