import java.util.Scanner;

public class Switch {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();
        if(buttom == 1){
            System.out.println("hi");
        }else if(buttom == 2){
            System.out.println("Namaste");

        }else if (buttom == 3){
            System.out.println("Hello");
        }else{
            System.out.println("invalid");
        }
    }

}
