import java.util.*;

/**
 * Created by Alice Colt.
 */
public class WordSearch {

    static List<String> wordSearchGrid(char[][] characters,
                                       int row,
                                       int column,
                                       Dictionary dictionary){


        // List for keeping all the solutions
        List<String> solution = new LinkedList<>();

        boolean[][] visited = new boolean[row][column];

        for (int index = 0; index < row; index++)
        {
            for (int row = 0; row < numRows; row++)
            {
                Set<String> validWord = wordGetter(Character.toString(characters[index][indexj]),
                                                  index, indexj, row, column, characters,visited,dictionary);

                // Add to solution list
                solution.addAll(validWord);
            }//for
        }//for


        // Return solution list
        return new ArrayList<>(solution);

    }// List wordSearchInGrid



    // Get word - using hashes

    static Set<String> wordGetter(String prefix,
                                  int indexRow, int row,
                                  int indexColumn, int column,
                                  char[][] characters,
                                  boolean[][] visited,
                                  Dictionary dictionary)
    {

        // Set for keeping all solutions
        Set<String> solution = new HashSet<>();
        
        if(dictionary.isWord((prefix)))
        {
            solution.add(prefix);
        }// if
        // Else return solution word without adding anything
        else
        {
            return solution;
        }// else



        int newRow = 0;
        int newCol = 0;

        for(int index = -1; index <= 1; index++)
        {
            for (int indexj = -1; indexj <= 1; indexj++)
            {
                newRow = indexRow + index;
                newCol = indexColumn + indexj;

                //if not out of grid
                if((newRow >= 0) && (newRow < indexRow ) &&
                   (newCol) >= 0  && (newCol < indexColumn) &&
                    (!visited[newRow][newCol]))
                {

                    String newSol = prefix + characters[newRow][newCol];

                    /*
                        Mark the visited one after getting the word in words set
                        Does not need to be taken again in the same wordsSolution set
                     */
                    visited[indexRow][indexColumn] = true;

                    Set<String> wordsSolution = wordGetter(newSol, newRow, indexRow,
                                                            newCol, indexColumn,
                                                            characters, visited, dictionary);

                    visited[newRow][newCol] = false;
                    solution.addAll(wordsSolution);

                }
            }
        }
        return solution;
    }// wordGetter
}//WordSearch
