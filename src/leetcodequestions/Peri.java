package leetcodequestions;

public class Peri {
	 static int perimeter=0;
	    public static int islandPerimeter(int[][] grid) {
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[i].length;j++){
	                if(grid[i][j]==1){
	                    perimeter=perimeter+4;
	                    if((i+1)<grid.length ){
		                     if(grid[i+1][j]==1){
		                    perimeter=perimeter-2;
		                } 
		                }
		                if((j+1)<grid[i].length){
		                   if(grid[i][j+1]==1){
		                    perimeter=perimeter-2;
		                }  
		                }
	                }
	              
	               
	            }
	        }
	        return perimeter;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
Peri peri = new Peri();
		int output = islandPerimeter(arr);
		System.out.println(output);
	}

}
