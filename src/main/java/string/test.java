package string;

public class test {

    public static void main(String[] args) {
        String a="asd";

    }

    private boolean compareStrings(String a, String b){

        int sizeOfA=a.length();

        if (a==null || b==null) return false;
        if (sizeOfA!=b.length()) return  false;

        char [] charA=a.toCharArray();
        char [] charB=b.toCharArray();

        for(int i=0;i<sizeOfA;i++)
        {
            if (charA[i]!=charB[i]) return false;
        }
        return true;
    }
}
