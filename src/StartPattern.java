public class StartPattern {

    public void runAllPattern() {
        System.out.println(">>> Star Pattern Programming <<<");
        // todo Star Pattern 1
        //  *
        //  * *
        //  * * *
        //  * * * *
        for( int r=1;r<=4;r++){
            for(int c=1;c<=r;c++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("<------------------>");
        // todo Star Pattern 2
        //  * * * *
        //  * * *
        //  * *
        //  *
        for(int r=1; r<=4; r++){
            for(int c=4; c>=r; c--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("<------------------>");
        // todo Star Pattern 3
        //  *
        //  * *
        //  * * *
        //  * * * *
        //  * * *
        //  * *
        //  *
        for(int r=1;r<=4;r++){
            for(int c=1;c<=r;c++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int r=1;r<=3;r++){
            for(int c=3;c>=r;c--){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("<------------------>");
        // todo Star Pattern 3
        //        *
        //      * *
        //    * * *
        //  * * * *
        int rowSize=8;
        for(int r=1;r<=rowSize;r++){
            // Revers loop for print space.
            for(int cb=rowSize-1;cb>=r;cb--){
                System.out.print("  ");
            }
            // print start if row is item is blank then print.
            for(int cS=1;cS<=r;cS++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("<------------------>");
        // todo Star Pattern 4
        //  * * * *
        //    * * *
        //      * *
        //        *

        for(int r=1;r<=4;r++){
            for(int cb=1;cb<=r;cb++){
                System.out.print("  ");
            }
            for(int cS=4;cS>=r;cS--){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("<------------------>");
        // todo Star Pattern 5
        //       *
        //      * *
        //    * * * *
        //  * * * * * *

        for(int r=1;r<=4;r++){
            for(int cb=3;cb>=r;cb--){
                System.out.print(" ");
            }
            for(int cS=1;cS<=r;cS++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("<------------------>");
        // todo Star Pattern 6
        //        *
        //      * *
        //    * * *
        //  * * * *
        //    * * *
        //      * *
        //        *

        for(int r=1;r<=4;r++){
            for(int cb=3;cb>=r;cb--){
                System.out.print(" ");
            }
            for(int cS=1;cS<=r;cS++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int r2=1;r2<=4;r2++){
            for(int cS=1;cS<=r2;cS++) {
                System.out.print(" ");
            }
            for(int cb=3;cb>=r2;cb--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("<------------------>");
        // todo Star Pattern 4
        //        *
        //      * _ *
        //    * _ * _ *
        //  * _ * _ * _ *

        for(int r=1;r<=4;r++){
            for(int cb=4; cb>=r;cb--){
                System.out.print(" ");
            }
            for(int cs=1;cs<=r;cs++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("<------------------>");
        // todo Star Pattern 4
        //        *
        //      * * *
        //    * * * * *
        //  * * * * * * *

        for(int r=1;r<=4;r++){
            for(int cb=4; cb>=r;cb--){
                System.out.print(" ");
            }
            for(int cs=1;cs<=r;cs++){
                System.out.print("*");
            }
            for(int l=2; l<=r;l++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("<------------------>");
        // todo Star Pattern 4
        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *

        for(int r=1;r<=4;r++){
            for(int cb=1; cb<=r;cb++){
                System.out.print(" ");
            }
            for(int cs=4;cs>=r;cs--){
                System.out.print("*");
            }
            for(int l=3; l>=r;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
