public class Euclid{
   public static int gcd(int p, int q){
      /*Calculate the greatest common divisor using 
      Euclid's algorithm
      Input:
        int p: a positive integer
        int q: a positive integer
      Output:
        return: the GCD of p & q
      Ex.
      gcd(54, 36) -> 18
      gcd(45, 20) -> 5
      */
   if (p == q) return p;
   else if (p == 0 || q == 0) return 0;
   else if (p == 1 || q == 1) return 1;
   else{
      if (p > q){
         return gcd(p-q, q);
      }
      else{
         return gcd(p, q-p);
      }
   }
   }
}