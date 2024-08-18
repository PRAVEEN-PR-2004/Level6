package leetcode.Medium;


import java.util.*;
public class LongPalin {
    public static void main(String[] args) {
    String s = "abccccdd";
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
        if (set.contains(c)) {
            set.remove(c);
        } else {
            set.add(c);
        }
    }
    
    int baseSize = s.length() - set.size();
    if (set.size() != 0){
      System.out.print(baseSize + 1);
    }
    else System.out.print(baseSize);
        
        
    }
}