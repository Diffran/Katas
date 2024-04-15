import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Konami {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> entrada = new ArrayList<String>();
        String konami = "arribaarribaabajoabajoderechaizquierdaderechaizquierdaba";
        String entradaComparacio="";

        System.out.println("Entra el codi: ");
        for(int i=0; i<10; i++){
            entrada.add(sc.nextLine());
        }

        for(String instruction : entrada){
            entradaComparacio=entradaComparacio.concat(instruction);
        }

        if(konami.equals(entradaComparacio.toLowerCase())){
            System.out.println("CODI CORRECTE!");
        }else{
            System.out.println("CODI INCORRECTE...");
        }
    }
}