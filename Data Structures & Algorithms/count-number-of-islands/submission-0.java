class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              if(grid[i][j]=='1'){
            //grid[i+1][j],[i][j+1],[i-1][j],[i][j-1] check for 1s
                 count++;
                island(i,j,grid);
               
                // if(grid[i][j+1]==1){
                
              }   
            }
        }
        return count; 
    }
        void island(int i,int j,char[][] grid){
            if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'){
                return;
            }
            grid[i][j]='0';
            island(i+1,j,grid);
            island(i,j+1,grid);
            island(i-1,j,grid);
            island(i,j-1,grid);
        }
      
    
}
