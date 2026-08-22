class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int temp=n;
        int product =1;
        while(temp!=0)
        {
            int r=temp%10;
            sum+=r;
            product*=r;
            temp=temp/10;
        }
        if(n%(sum+product)==0)
        {
            return true;
        }
       else
       {
        return false;
       }
    }
}