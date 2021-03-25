public class Fibonacci{
   public static int fibonacci(int n){
      /*Return the nth Fibonacci number
      Input:
         int n: the index of the Fibonacci number to generate
      Output:
         return: the nth Fibonacci number
      Ex.
      fibonacci(0) -> 1
      fibonacci(2) -> 2
      fibonacci(5) -> 8
      */
      if (n == 0) return 1;
      else if (n == 1) return 1;
      else{
         return fibonacci(n-1) + fibonacci(n-2);
      }
   }
}