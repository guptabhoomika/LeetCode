class Solution {
    static final int MAX_CHAR = 26;
public List<Integer> findAnagrams(String s, String p) {


    List<Integer> result = new ArrayList<Integer>();
    
    for(int i =0;i<s.length() && i+(p.length()-1) < s.length();i++)
    {
      
       boolean a =isAnagram(s.substring(i, i+(p.length())), p);
        

       if(a)
       {
           result.add(i);
       }


    }

    return result;
    
}

public boolean isAnagram(String s, String t) {
    int countS[] = new int[MAX_CHAR];
       int countt[] = new int[MAX_CHAR]; 
       

       for (int i = 0; i < s.length(); i++) 
       {
           countS[s.charAt(i)-'a']++; 
       }
       for (int i = 0; i < t.length(); i++) 
       {
           countt[t.charAt(i)-'a']++; 
       }
       
       
      
    
       
       for(int i =0;i<countS.length;i++)
       {
           if(countS[i]!=countt[i])
           {
               return false;
           }

       }
   
      




       return true;
   
}
    
}
