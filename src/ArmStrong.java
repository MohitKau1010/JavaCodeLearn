public class ArmStrong {

    int number = 4, originalNumber, remainder, result;

    void checkArmstrong(){
        originalNumber = number;
        while (originalNumber != 0){
            System.out.println("1>> number : "+number+" ");
            remainder = originalNumber % 10;
            System.out.println("1>> remainder : "+remainder+" ");
            result += Math.pow(remainder, 3);
            System.out.println("1>> result : "+result+" ");
            originalNumber /= 10;
            System.out.println("1>> originalNumber : "+originalNumber+" ");
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

            System.out.println("Test");
    }


}
