public class CosmicLong{
   public static String numToText_English(long i){
      /*Convert any long to its English textual representation
      Input:
         long i: an longeger to convert to English text
      Output:
         return: a String representing the English word for i
      Ex.
      numToText_English(4)   -> "four"
      numToText_English(26)  -> "twenty six"
      numToText_English(101) -> "one hundred one"
      numToText_English(-12) -> "negative twelve"
      */
      if(100 <= i && i <= 999){
         long other = i % 100;
         long hund = (i - other) / 100;
         return numToText_English(hund) + " hundred " + numToText_English(other);
      }
      //Step 2, thousands 1000􏰀999999
      //Assume that you have 0􏰀9999 working for this section
      if(1000 <= i && i <= 999999) {
         long other = i % 1000;
         long thousand = (i - other) / 1000;
         return numToText_English(thousand) + " thousand " + numToText_English(other);
      }
      //Step 3, tens 20􏰀99
      //Assume that you have 0􏰀19 working for this section
      if(20 <= i && i <= 99) {
         long other = i % 10;
         long tens = (i - other)/10;
         String tenString = "";
         if (tens == 2){
            tenString = "twenty";
         }
         if (tens == 3){
            tenString = "thirty";
         }
         if (tens == 4){
            tenString = "forty";
         }
         if (tens == 5){
            tenString = "fifty";
         }
         if (tens == 6){
            tenString = "sixty";
         }
         if (tens == 7){
            tenString = "seventy";
         }
         if (tens == 8){
            tenString = "eighty";
         }
         if (tens == 9){
            tenString = "ninety";
         }
         return tenString + " " + numToText_English(other);   
      }
      //Step 4, ones and teens 0􏰀19
      //This step is all special cases
      if(0 <= i && i <= 19){
         if (i == 0) return "zero";
         if (i == 1) return "one";
         if (i == 2) return "two";
         if (i == 3) return "three";
         if (i == 4) return "four";
         if (i == 5) return "five";
         if (i == 6) return "six";
         if (i == 7) return "seven";
         if (i == 8) return "eight";
         if (i == 9) return "nine";
         if (i == 10) return "ten";
         if (i == 11) return "eleven";
         if (i == 12) return "twelve";
         if (i == 13) return "thirteen";
         if (i == 14) return "fourteen";
         if (i == 15) return "fifteen";
         if (i == 16) return "sixteen";
         if (i == 17) return "seventeen";
         if (i == 18) return "eighteen";
         if (i == 19) return "nineteen"; 
      }
      //Step 5, negative numbers
      //Assume that you have it working for all positive values
      if(i < 0) {
         return "negative " + numToText_English(Math.abs(i));
      }
      //Step 6, millions
      if(1000000 <= i && i <= 999999999){
         long other = i % 1000000;
         long mil = (i - other) / 1000000;
         return numToText_English(mil) + " million " + numToText_English(other);
      }
      //Step 7, billions, the largest possible longs
      if(i >= 1000000000){
         long other = i % 1000000000;
         long bil = (i - other) / 1000000000;
         return numToText_English(bil) + " billion " + numToText_English(other); 
      }
      //Otherwise, something went wrong
      else{
         return "number unsupported";
      }
      
   }
   public static String cosmicNumber(long i){
      /*Returns the string of numbers leading back to 4
      in the "Four is Cosmic" riddle
      Input:
         long i: the number to start with
      Output:
         return: the String of numbers leading back to 4
      Ex.
      cosmicNumber(3) ->  "3, 5, 4"
      cosmicNumber(17) -> "17, 9, 4"
      */
      String finalstring = "";
      String tempString = stripSpace(numToText_English(i));
      long length = i;
      while (!tempString.equals("four")){
        finalstring += length;
        finalstring += ", ";
        length = stripSpace(tempString).length();
        tempString = stripSpace(numToText_English(length));
      }
      finalstring += 4;
      return finalstring;
   }
   public static long cosmicNumberTester(int z){
      /*Returns the string of numbers leading back to 4
      in the "Four is Cosmic" riddle
      Input:
         long i: the number to start with
      Output:
         return: the String of numbers leading back to 4
      Ex.
      cosmicNumber(3) ->  "3, 5, 4"
      cosmicNumber(17) -> "17, 9, 4"
      */
      int tempCounter = 0;
      long fCounter = 0;
      for (long f = 0; tempCounter < z; f++){
         tempCounter = 1;
         for (int i = 0; i < cosmicNumber(f).length(); i++){
            if (cosmicNumber(f).charAt(i) == ',')
            tempCounter++;
         }
         fCounter = f;
         StdOut.println(fCounter);
      }
      return fCounter;
   }
   public static String stripSpace(String s){
      /*Returns the String with spaces stripped
      Input:
         String s: the String to be stripped
      Output:
         return: a new String with all spaces stripped
      Ex.
      stripSpace("tiger") -> "tiger"
      stripSpace("tony tiger") -> "tonytiger"
      stripSpace("tony the tiger" -> "tonythetiger"
      */
      String newstring = "";
      for (int i = 0; i < s.length(); i++){
         if (s.charAt(i) != ' '){
            newstring += s.charAt(i);
         }
      }
      return newstring;
   }
   public static void main(String args[]){
      StdOut.println("Did you know that 4 is cosmic?");
      while(true){
         StdOut.println("Pick an integer: "); 
         long i = StdIn.readLong();
         StdOut.println(cosmicNumber(i));
         StdOut.println("4 is cosmic!");
      }
   }
}