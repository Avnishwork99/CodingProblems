/*given a string "s" we need to find the minimum partition 
such that the sub string formed are all palindroms 
s = nitip
ans = 2
n | iti | p
*/

import java.util.Scanner;

public class PalindromePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int i = 0;
        int j = s.length();
        int x = solve(s,i,j);
        System.out.println(x);
    }

    static int solve(String s,int i,int j){
        if(i>=j){
            return 0;
        }
        if(isPalindrome(s,i,j)){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp = solve(s, i, k) + solve(s, k+1, j) +1;
            if(ans>temp)
                ans = temp;
        }
        return ans;
    }

    static boolean isPalindrome(String s, int i, int j){
        int count = 0;
        for(int k=i;k<=((j-i)/2);k++){
            if(s.charAt(i+count)!=s.charAt(j-count)){
                return false;
            }
            count++;
        }
        return true;
    }
}
