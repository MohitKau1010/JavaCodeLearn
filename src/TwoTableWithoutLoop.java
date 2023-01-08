public class TwoTableWithoutLoop {


    public void showTwoTable(int n){
        if(n<=10){
            System.out.println("2 * " + n + " = " + 2*n );
            n= n+1;
            showTwoTable(n);
        }
    }
}
