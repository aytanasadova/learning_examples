package OOP;

public class CompareableEx implements Comparable{

    private int k;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        CompareableEx c=new CompareableEx();
        c.compareTo(new Person());
    }
}