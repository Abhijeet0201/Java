public class Pattern4 {
    public static void main(String[]a){
        int n = 5;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //1st half no
            for(int j=i;j>=1; j--){
               System.out.print(j);
            }
            //2nd half no
            for(int j =2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
