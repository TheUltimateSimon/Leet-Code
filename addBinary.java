// Leetcode Problem 67: Add Binary
class addBinary {
    public String addBinary(String a, String b) {
      // Depending on which one is bigger, add '0' at the beginning to match the length of the other.
      // The string will move to newB and newA respectively.
        String newB = "";
        if(a.length() > b.length()){
            for(int x = 0; x < (a.length() - b.length()); x++){
                newB += "0";
            }
            newB += b;
        }
        else 
            newB = b;
        String newA = "";
        if(a.length() < b.length()){
            for(int x = 0; x < (b.length() - a.length()); x++){
                newA += "0";
            }
            newA += a;
        }
        else 
            newA = a;

      // Remainder can either be '0' or '1'
        char remainder = '0';
        String binaryString = "";

      // Starting at the right side of binary until 0, add the remainder (which is default to 0 for the first addition) to the
      // a and b to determine action.
        for(int y = newA.length() - 1; y >= 0; y--){
           int num =(newA.charAt(y) - '0') + (newB.charAt(y) - '0') + (remainder - '0'); 
          // If all are 1s
           if(num == 3)
           {
               remainder = '1';
               binaryString = "1" + binaryString;
           }  
         // If 2 of them has '1'.
           else if(num == 2)
           {
               remainder = '1';
               binaryString = "0" + binaryString;
           }
        // If 1 has '1'.
           else if (num == 1)
           {
               remainder = '0';
               binaryString = "1" + binaryString;
           }
       // If added digit from a, b, and remainder is '0'
           else {
               remainder = '0';
               binaryString = "0" + binaryString;
           }
        }
      // Add an extra '1' if it has a remainder.
        if(remainder == '1')
        {
            binaryString = '1' + binaryString;
        }
        return binaryString;
    }
}
