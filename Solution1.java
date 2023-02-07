package org.example;

public class Solution1 {
    public String solution(String s, int numRows){
        int n = s.length() -1;
        int k = 2* (numRows -1 );

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i <= s.length()-1; i++){
            int index = i;

            while (index <= n) {
                newString.append(s.charAt(index));
                if (i!= 0 && i != numRows-1){
                    int k1 = k - 2*i;
                    int k2 = index + k1;
                    newString.append(s.charAt(k2));
                }
                index = index + k;
            }
        }
        return newString.toString();
    }
}
