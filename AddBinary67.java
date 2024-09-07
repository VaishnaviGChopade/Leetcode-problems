import java.math.BigInteger;

public  class AddBinary67 {
    public static String addBinary(String a, String b) {
        BigInteger s1=new BigInteger(a,2);
        BigInteger s2=new BigInteger(b,2);
        BigInteger res=s1.add(s2);

        return res.toString(2);
}
public static void main(String[] args) {
    String a="1010", b="1011";
    String res=addBinary(a, b);
    System.out.println(res);
}
}
