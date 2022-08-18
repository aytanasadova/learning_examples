package main.java.string;

public class Main {

//    public final class String  implements java.io.Serializable, Comparable<java.lang.String>, CharSequence
//    public final class StringBuilder extends AbstractStringBuilder  implements java.io.Serializable, Comparable<java.lang.StringBuilder>, CharSequence

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("dfdg");
//      sb.append(null);   both method append(java.lang.CharSequence) in java.lang.StringBuilder and method append(char[]) in java.lang.StringBuilder match


        System.out.println(sb);
    }
}
