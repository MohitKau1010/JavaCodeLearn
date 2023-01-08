public class PrintReverseIntegerNumber {

    public void reverseIntegerNumber(){
        int number = 987654321;
        int lastNumber;
        int reverse= 0;
        System.out.println(" Original string is : " + number);

        while (number != 0){
            //todo  Isolate the last digit in number
            lastNumber = number %  10;
            System.out.println("step 1 :  number is ("+number+") & lastNumber is : ("+lastNumber+")");

            //todo  Append lastDigit to reverse
            reverse = (reverse * 10) + lastNumber;
            System.out.println("step 2 :  number is ("+number+") & reverse is : ("+reverse+")");

            //todo  Remove the last digit from num
            number /= 10;
            System.out.println("step 3 :  number is ("+number+")");
            System.out.println();
        }
        System.out.println(" Reversed string is : " + reverse);
    }

    public void reverserWithForLoop(){
        System.out.println("<<<--Reverse a number using a for loop in Java-->>");

        int number = 123456;
        int lastNumber;
        int reverse=0;

        for(;number != 0;number /= 10){
            System.out.println(" number is : "+ number);
            lastNumber = number % 10;
            reverse = reverse * 10 + lastNumber;
            System.out.println(" lastNumber :"+ lastNumber +" Reverse :"+ reverse);
            System.out.println();
        }
        System.out.println(" Reversed string is : " + reverse);
    }
}
