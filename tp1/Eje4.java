import java.util.Scanner;

  public class eje4.java 
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 números enteros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1 > num2 & num1 >num3) {
            System.out.println("El mayor numero es: ", num1);}
            else{
                if(num2 > num1 & num2 > num3){
                    System.out.println("El mayor numero es: ", num2);
                else 
                (System.out.println("El mayor numero es: ", num3);)
                            
}
            }
        
      }
      scanner.close();