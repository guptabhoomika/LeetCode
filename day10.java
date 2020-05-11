class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] == newColor)
        {
            return image;
        }
        fill(image, sr, sc, newColor, image[sr][sc]);
        return image;



        
    }
    public void fill(int[][] img,int i ,int j ,int newC,int c)
    {
        if(i<0 || i >= img.length || j<0 || j >= img[i].length || img[i][j] !=c )
        {
            return;
        }
          img[i][j] = newC;

        fill(img, i+1, j, newC, c);
        fill(img, i-1, j, newC, c);
        fill(img, i, j+1, newC, c);
        fill(img, i, j-1, newC, c);

    }
    
}