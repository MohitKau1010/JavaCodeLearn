public class Palindrome {

//   todo  For example, 3553, 12321, etc.
    public void checkPalindrome(){


        String num2 = "Radar"; // True
        int stringLength = num2.length()-1;
        String newString = "";
        /// Opposite loop
        for(int i =stringLength; i>=0;i--){
              newString = newString+num2.charAt(i);
            System.out.println("new string"+ newString);
        }

        /// For integer number only
        int num = 123219999; // False
        int originalNumber = num;
        int reversed = 0;
        while(num!=0){
            int reminder = num % 10;
            reversed = (reversed*10)+reminder;
            num /= 10;
            System.out.println("Number is : " + num+ " Reverse "+ reversed);
        }

        // todo Check Palindrome or not
        if(originalNumber == reversed){ /*newString.toLowerCase().equals(num2.toLowerCase())*/
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
