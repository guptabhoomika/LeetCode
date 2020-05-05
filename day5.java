class Solution {
    //asciichars
    static final int MAX_CHAR = 256; 
      public int firstUniqChar(String s) {
          //array to stire count
          int count[] = new int[MAX_CHAR]; 

          //counts occurence of each char in the string
        
          for (int i = 0; i < s.length(); i++) 
          {
              count[s.charAt(i)]++; 
          }
         
            int index=-1;

            //checks which char count is 1 and returns its index
          
          for(int i =0;i<s.length();i++)
          {
              if(count[s.charAt(i)]==1)
              {
                  index = i;
                  break;
              }

          }
      
      
         




          return index;
      }
      

      
          
  }
