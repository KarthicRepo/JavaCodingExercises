package com.java.learning.junk;

public class PrintNonRepeatedChars {
    public static void main(String[] args) {
        String text = "zaaaaaabbbbbxcccccdddeeffgghhiijjjkzllmmnnooppqqrrzszttuuvvwwxxyyzzzk";
        char[] strChar = text.toCharArray();
        int size = text.length() - 1;
        int left = 0;
        int right = 1;
        while (right < size)

        {
            while (right < size && strChar[left] == strChar[right]) {
                right++;
                left++;
            }
            if(left <1 && strChar[left]!=strChar[right])
                System.out.print(strChar[left]);
            left++;
            right++;
            if(right < size && left >=1 && (strChar[left] != strChar[right]))
                    System.out.print(strChar[left]);
        }
    }
}
