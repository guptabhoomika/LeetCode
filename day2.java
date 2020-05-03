class day2
{
    public int numJewelsInStones(String J, String S) {
        int co =0;
        for(int i =0;i<S.length();i++)
        {

            char c = S.charAt(i);
            if(J.indexOf(c)>-1)
            {
                co++;
                
            }
           
        }
        return co;
    }
}