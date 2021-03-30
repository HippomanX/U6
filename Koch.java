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
      if (n == 0) {
         t.step(length);   
      }
      else if (n == 1) {
         t.step(length/3);
         t.turn(Math.PI/3);
         t.step(length/3);
         t.turn(-2*Math.PI/3);
         t.step(length/3);
         t.turn(Math.PI/3);
         t.step(length/3);
         
      }
      else {
         kochHelper(n-1, t, length/3);
         t.turn(Math.PI/3);
         kochHelper(n-1, t, length/3);
         t.turn(-2*Math.PI/3); 
         kochHelper(n-1, t, length/3);
         t.turn(Math.PI/3);
         kochHelper(n-1, t, length/3);
      }
   }
   public static void kochCurve(int n){
      StdDraw.setXscale(0, 1);
      StdDraw.setYscale(-0.5, 0.5);
      Turtle t = new Turtle();
      kochHelper(n, t, 1.0);
   }
}