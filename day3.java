import java.util.Stack;

public class day3 {
    public boolean canConstruct(String ransomNote, String magazine) {
      Stack<Character> st = new Stack<Character>();
      if(ransomNote.length()==0&&magazine.length()==0)
      {
          return true;
      }
      if(ransomNote.isEmpty()&&magazine.length()>1)
      {
          return true;
      }
      if(magazine.isEmpty())
      {
          return false;
      }
      for(int k =0;k<magazine.length();k++)
      {
          st.push(magazine.charAt(k));
      }
      int  i=0;
      for(i=0;i<ransomNote.length() && !st.isEmpty();i++)
      {
          if(st.contains(ransomNote.charAt(i)))
          {
              int k = st.indexOf(ransomNote.charAt(i));
             st.remove(k);

          }
          else
          {
              return false;
          }

      }


        return true;
        
    }
    
}