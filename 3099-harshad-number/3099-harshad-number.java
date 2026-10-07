class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int n=0;
        int m=x;
        while(x>0){
            n=x%10;
            sum=sum+n;
            x=x/10;

        }
        if(m%sum==0){
            return sum;
        }
     return -1;
        
    }
}