public class Pascal{
   public static int pascalEntry(int row, int col){
   /*Calculates the entry in Pascal's Triangle at row, col.
   Indices start at 0, so the "first" row is row 0.
   Input:
      int row: the row index of the entry to calculate
      int col: the column index of the entry to calculate
   Output:
      return: the entry in Pascal's Triangle at row, col
   Ex.
   pascalEntry(0, 0) -> 1
   pascalEntry(4, 4) -> 1
   pascalEntry(4, 2) -> 6
   */
      if (row == 0 && col == 0) return 1;
      if (row == 1 && col == 0) return 1;
      if (row == 1 && col == 1) return 1;
      if (row == col) return 1;
      if (col == 0) return 1;
      return pascalEntry(row-1, col) + pascalEntry(row-1, col-1);
      
   }
}