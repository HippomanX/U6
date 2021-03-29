public class Sierpinski{
   public static void carpetHelper(int n, double s, double x, double y){
      /*Draw an s by s Sierpinski Carpet of order n centered 
      at (x, y).
      Input:
         int n: the order of the Sierpinski Carpet to draw
         double s: the side length of the Sierpinski Carpet
         double x: the x-coord of the center of the carpet
         double y: the y-coord of the center of the carpet
      Output:
         StdDraw: draw an order n Sierpinski\ carpet centered
                  at (x, y) with dimensions s by s
      */
      if (n == 0){
      StdDraw.filledRectangle(x, y, s, s);
      }
      else if (n == 1){
      //StdDraw.setScale(0, s);
      //top row
      StdDraw.filledRectangle(x-s/3, y+s/3, s/6, s/6);
      StdDraw.filledRectangle(x, y+s/3, s/6, s/6);
      StdDraw.filledRectangle(x+s/3, y+s/3, s/6, s/6);
      //middle row
      StdDraw.filledRectangle(x-s/3, y, s/6, s/6);
      
      //special case, clear
      //StdDraw.filledRectangle(x, y, s/6, s/6);
      
      StdDraw.filledRectangle(x+s/3, y, s/6, s/6);
      //bottom row
      StdDraw.filledRectangle(x-s/3, y-s/3, s/6, s/6);
      StdDraw.filledRectangle(x, y-s/3, s/6, s/6);
      StdDraw.filledRectangle(x+s/3, y-s/3, s/6, s/6);
      }
      else{
      carpetHelper(n-1, s/3, x-s/3, y+s/3);
      carpetHelper(n-1, s/3, x, y+s/3);
      carpetHelper(n-1, s/3, x+s/3, y+s/3);
      
      carpetHelper(n-1, s/3, x-s/3, y);
      
      carpetHelper(n-1, s/3, x+s/3, y);
      
      carpetHelper(n-1, s/3, x-s/3, y-s/3);
      carpetHelper(n-1, s/3, x, y-s/3);
      carpetHelper(n-1, s/3, x+s/3, y-s/3);
      }
   }
   public static void drawCarpet(int n){
      /*Draw a Sierpinski Carpet of order n to StdDraw
      Input:
         int n: the order of the Sierpinski Carpet to draw
      Output:
         StdDraw: draw an order n Sierpinski Carpet
      */
      carpetHelper(n, 1.0, 0.5, 0.5);
   }
}