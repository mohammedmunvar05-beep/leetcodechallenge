class Solution {
    public int mirrorDistance(int n) {
        int m=0;
        int original=n;
        int sum=0;
        int result=0;
        while(n>0){
            m=n%10;
            sum=sum*10+m;
            n=n/10;

        }
        result=Math.abs(original-sum);
        return result;
        
    }
}