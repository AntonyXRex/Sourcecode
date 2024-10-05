import java.util.*;
public class anagram {
    public boolean isAnagram(String s, String t) {
        int sletter[]=new int[26];
        int tletter[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            sletter[c%97]+=1;
        }
        for(int j=0;j<t.length();j++){
            char c=t.charAt(j);
            tletter[c%97]+=1;
        }
        if(Arrays.equals(sletter,tletter)==true){return true;}
        else{return false;}
    }

    public static void main(String[] args) {
        anagram anagram=new anagram();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s=sc.nextLine();
        System.out.print("Enter the second string: ");
        String t=sc.nextLine();
        sc.close();
        boolean result=anagram.isAnagram(s,t);
        System.out.println(result?"The strings are anagrams":"The strings are not anagrams");
    }
}
