public class OptimizedPalindromePartition {
    int solve(string s, int i, int j){
        if(i>=j)
            return 0;
        if(isPalindrome(s,i,j))
            return 0;
        for(int k=i;k<=j;k++){
            int temp = solve(s,i,k)+solve(s,k+1,j)+1;
            int 
        }
    }
}
