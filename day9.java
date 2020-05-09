class Solution {
    public boolean isPerfectSquare(int num) {
        Double d = new Double(num);
        double sq = Math.sqrt(d);
        /* Math.floor() returns closest integer value, for
	 
	 * if sq is non integer than the below expression would
	 * be non-zero.
	 */
        if(sq-Math.floor(sq)==0)
        {
            return true;
        }

        return false;
        
    }
}