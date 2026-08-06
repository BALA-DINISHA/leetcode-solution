class Solution {
 
    public int smallestNumber(int n, int t) {
             int p=product(n);  
            if(p%t==0)
            {
                return n;
            } 
            
            return smallestNumber(n+1,t);

    }

    public int product(int n)
    {
        int pro=1;
        while(n!=0)
        {
            pro=pro*(n%10);
            n=n/10;
        }
        return pro;
    }
}