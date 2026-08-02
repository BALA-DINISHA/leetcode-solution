class Solution {
    public String toGoatLatin(String sentence) {
        String s[] = sentence.split(" ");
        StringBuffer add= new StringBuffer();
        for(int i=0;i<s.length;i++)
        {
            String k=s[i];
            char g=k.charAt(0);
            if(g=='a'||g=='e'||g=='i'||g=='o'||g=='u'||g=='U'||g=='O'||g=='I'||g=='E'||g=='A')
            {
                k=k+"ma";
            }
            else 
            {
                k=k.substring(1,k.length())+k.substring(0,1);
                k+="ma";

            }
            add.append(k);
            for(int j=0;j<=i;j++)
            {
                add.append("a");
            }
            if(i!=s.length-1)
            {
                add.append(" ");
            }

        }
        return add.toString();
    }
}