package patterns;

public class patterns {
    public static void main(String[] args) {
        pattern31(5);

    }
    static void pattern1(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    static void pattern2(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
                System.out.println();
        }


    }
    static void pattern3(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    static void pattern4(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }


    }
    static void pattern5(int n){
        for (int row=0;row< 2*n;row++){
            int totalcol = row > n ? 2 * n - row : row;
            for (int col=0;col<totalcol;col++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
    static void pattern28(int n){
        for (int row=0;row< 2*n;row++){

            int totalcol = row > n ? 2 * n - row : row;
            int spaces= n-totalcol;
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col=0;col<totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();

        }


    }
    static void pattern30(int n){
        for (int row=1;row< n;row++){


            for (int s=0;s<n-row;s++){
                System.out.print(" ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col);
            }
            for (int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();

        }


    }
    static void pattern31(int n){
        int a=n;
        n=2*n;
        for(int row=0;row<=n;row++){

            for(int col=0;col<=n;col++){
                int atEveryIndex=a-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");

            }
            System.out.println();
        }
    }

}
