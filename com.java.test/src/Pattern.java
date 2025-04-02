import java.util.*;



public class Pattern{
    public static void main(Strings[] args) throws Exception {
        int m = 0, n = 0;
        try (Scanner sc = new Scanner(System.in);){        
            System.out.println("Enter the first number : ");
            m = sc.nextInt();
            System.out.println();
    
            System.out.println("Enter the second number : ");
            n = sc.nextInt();
        }catch(Exception E){
        }

        

         
        
/////////////////////////////////////////////////////////////
                // ****** //
                // ****** //
                // ****** //
                // ****** //
                // ****** //
///////////////////////////////////////////////////////////// 
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
                // 012345 //
                // 012345 // 
                // 012345 //
                // 012345 // 
                // 012345 //
///////////////////////////////////////////////////////////// 

        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(j);
                }
                System.out.println();
            }
            
/////////////////////////////////////////////////////////////
                // ****** //
                // *    * //
                // *    * // 
                // *    * //
                // ****** //
///////////////////////////////////////////////////////////// 
            
        for (int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++){
                if(i==1||j==1||i==m||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

/////////////////////////////////////////////////////////////
                // *     //
                // **    //
                // ***   //
                // ****  //
                // ***** //
/////////////////////////////////////////////////////////////

        for (int i = 1; i <= m; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        System.out.println("");
        }

/////////////////////////////////////////////////////////////
                //     * //
                //    ** //
                //   *** //
                //  **** //
                // ***** //
/////////////////////////////////////////////////////////////

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 

/////////////////////////////////////////////////////////////
                // 1         //
                // 1 2       //
                // 1 2 3     //
                // 1 2 3 4   //
                // 1 2 3 4 5 //
/////////////////////////////////////////////////////////////

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        } 

/////////////////////////////////////////////////////////////
                // 1 2 3 4 5 //
                // 1 2 3 4   //
                // 1 2 3     //
                // 1 2       //
                // 1         //
/////////////////////////////////////////////////////////////

        for (int i = m; i >= 0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
                // 1              //
                // 2 3            // 
                // 4 5 6          //
                // 7 8 9 10       //
                // 11 12 13 14 15 //
/////////////////////////////////////////////////////////////

        int num = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
                // 1         //
                // 0 1       //
                // 1 0 1     //
                // 0 1 0 1   //
                // 1 0 1 0 1 //
/////////////////////////////////////////////////////////////

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                System.out.print("0 ");
                }
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
                // *             * //
                // * *         * * //
                // * * *     * * * //
                // * * * * * * * * //
                // * * * * * * * * //
                // * * *     * * * //
                // * *         * * //
                // *             * //
/////////////////////////////////////////////////////////////

        for(int i = 1; i<=m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            int spaces = 2*(m-i);
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = m; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            int spaces = 2*(m-i);
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
                    //         * * * * * //
                    //       * * * * *   //
                    //     * * * * *     //
                    //   * * * * *       //
                    // * * * * *         //
/////////////////////////////////////////////////////////////

        for (int i = 1; i <= m; i++ ){
            for(int j = 1; j<= (m-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

///////////////////////////////////////////////////////////
                   /*           * * * * * //
                              *       *   //
                            *       *     //
                          *       *       //
                        * * * * *         */
///////////////////////////////////////////////////////////

        for (int i = 1; i <= m; i++ ){
            for(int j = 1; j<= (m-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= m; j++){
                if(i==1||i==m||j==1||j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
                /*      1
                       2 2
                      3 3 3
                     4 4 4 4
                    5 5 5 5 5 */
/////////////////////////////////////////////////////////////

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= (m-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
/* 1
  212
 32123
4321234 */
////////////////////////////////////////////////////////////

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= (m-i); j++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

/////////////////////////////////////////////////////////////
/*  *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    * */
////////////////////////////////////////////////////////////

        for(int i=1; i<=m; i++) {
            for(int j=1; j<=m-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=m; i>=1; i--) {
            for(int j=1; j<=m-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
