package Array;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) {

        // Single-dimentioanl arrays. Clone method uses deep copy
        int iarray[] = {1, 2, 3};
        int copyArray[] = iarray.clone();

        // Multi-dimentioanl arrays. Clone method uses swallow copy
        int karray[][] = {{1, 2, 3},{4, 5, 6}};
        int copyKarray[][] = karray.clone();

        Arrays.toString(karray);

        String sarr[]={"myStringArray"};

        changeStringArray(sarr);
        System.out.println(Arrays.toString(sarr));


        Integer iarr[]={4,4};

        changeIntegerArray(iarr);
        System.out.println(Arrays.toString(iarr));



    }

    private static void changeStringArray(String [] arr){
        arr= new String[]{"myStringArray1"};
    }

    private static void changeIntegerArray(Integer [] arr){
//        arr= new Integer[]{3,4};    this does not affect.  result 4,4
          arr[0]=5;  // this line makes affect result 5,4
    }

}
