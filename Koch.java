public class Koch{
   public static void kochHelper(int n, Turtle t, double length){
      /*Draw an order n Koch curve using Turtle t
      Input:
         int n: the order of the Koch curve to draw
         Turtle t: the Turtle used to draw the Koch curve
         double length: the total length of the Koch curve drawn
      Output:
         StdDraw: an order n Koch curve is drawn to StdDraw
      */
   }
   public static void kochCurve(int n){
      StdDraw.setXscale(0, 1);
      StdDraw.setYscale(-0.5, 0.5);
      Turtle t = new Turtle();
      kochHelper(n, t, 1.0);
   }
}