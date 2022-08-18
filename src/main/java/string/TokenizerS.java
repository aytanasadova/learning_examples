package main.java.string;

import java.util.StringTokenizer;

public class TokenizerS {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Hello world","",true);
        while (st.hasMoreElements())
            System.out.println(st.nextToken());
    }
}
