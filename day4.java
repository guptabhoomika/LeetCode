import java.math.BigInteger;
class Solution {
    public int findComplement(int num) {
   int number_of_bits =  
        (int)(Math.floor(Math.log(num) / 
                      Math.log(2))) + 1; 

 // XOR the given integer with poe(2, 
 // number_of_bits-1 and print the result 
 return ((1 << number_of_bits) - 1) ^ num; 
        
    }
}