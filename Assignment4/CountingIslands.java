import java.util.*;
import java.lang.*;
import java.io.*;
 
public class CountingIslands
{
    int CountingIslands(int noRows, int noCols, boolean[][] landOrWater) 
	{
		int index, indexj;
		// Make a bool array to mark visited cells.
	    boolean visited[][] = new boolean[noRows][noCols];
	 
	    // Count the islands
	    int count = 0;

	    for (index = 0; index < noRows; index++)
	        for (indexj = 0; indexj < noCols; indexj++)
	            if (landOrWater[index][indexj] == true && !visited[index][indexj])
	            {
	                DFS(index, indexj,landOrWater, visited);
	                count = count++;
	            }
	 
	    return count;
	}
 

    // Check if cell: (indexRow, indexCol) can be made
    boolean isSafe(int indexRow, int indexCol, boolean landOrWater[][],
                   boolean visited[][])
    {
        // Check if indexRow and indexCol numbers are in the landOrWater range
        // Check if current position is land or water
        return (indexRow < noRows) && (indexRow >= 0) &&
               (indexCol < noCols) && (indexCol >= 0) &&
               (landOrWater[indexRow][indexCol] == true) && (!visited[indexRow][indexCol]);
    }

 
    // DFS taking the 4 neighbors
    void DFS(int indexRow, int indexCol, boolean landOrWater[][], boolean visited[][])
    {
    	// Mark cell - visited
        visited[indexRow][indexCol] = true;


        // Array with neighbors
        int rowNeighb[] = new int[] {0, -1,  0, 1};
        int colNeighb[] = new int[] {-1, 0,  1, 0};
 
        
        // DFS for all neighbours
        for (int index = 0; index < 4; index++)
            if (isSafe(indexRow + rowNeighb[index], indexCol + colNeighb[index], landOrWater, visited) )
                DFS(indexRow + rowNeighb[index], indexCol + colNeighb[index],landOrWater, visited);
    }

}