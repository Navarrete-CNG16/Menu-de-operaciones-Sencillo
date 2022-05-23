package menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) throws IOException {
   BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
   Scanner M = new Scanner(System.in);
   String  varope;
   String opcion;
   opcion="";
   
   
   
   
   while(!opcion.equals("5")){ 
             JOptionPane.showInputDialog("Dijite la opcion deseada: \n 1. suma \n 2. Resta \n3. Divicion \n4. Multiplicacion \n5. Salir");
              
              
             switch (opcion){
                 case "1":
                     System.out.println("Escogiste la opcion 1° = suma ");
                     System.out.println("Dame el primer valor: ");
                    float h = M.nextFloat();
                     System.out.println("Dame el segundo valor: ");
                    float r1 = M.nextFloat();
   float res2 = (h+r1);
   System.out.println("el resultado es:"+" "+res2);
                     
                     
                     
                     break;
                      case "2":
                     System.out.println("escogiste la opcion 2");
                    System.out.println("dijita primer numero a restar:");
      float d1=M.nextFloat();
      System.out.println("dijite segundo numero a restar:");
 float d2=M.nextFloat();
   float re3 = d1-d2;
   System.out.println("el resultado es:"+" "+re3);
                     break;
                
                 case "3":
                    System.out.println("escogiste opcion 3°= divicion");
                    System.out.println("dijita dividendo:");
   float div = M.nextFloat();
   System.out.println("dijita numero divisor:");
   float divs = M.nextFloat();
   float res = div/divs;
   System.out.println("el resultado es:"+" "+res);
                     break;
                 default:
                     System.out.println("Opción incorrecta.");
                     break;
                }
             }
    }
             
}

