package main.java.com.gtr3base;

import java.util.Arrays;

public class Main {
    public String longestCommonPrefix(String[] strs){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i =0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
    public static void main(String[] args) {

        Main main = new Main();
        String[] strs = new String[]{"flower","flow"};

        System.out.println(main.longestCommonPrefix(strs));
    }
}