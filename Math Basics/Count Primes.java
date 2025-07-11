/*Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 

Constraints:

0 <= n <= 5 * 106*/

class Solution {
    public int countPrimes(int n) {
        boolean arr[]=new boolean[n];
        for(int i=2;i<n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==true){
                c++;
            }
        }
        return c;
    }
}
