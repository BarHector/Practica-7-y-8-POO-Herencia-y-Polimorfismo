import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nao = new Scanner(System.in);
        
        String orden;
        int number;
        String word;

        ArrayList <Integer> listN = new ArrayList<>();
        ArrayList <String> listS = new ArrayList<>();

        orden = nao.nextLine();

        if(nao.hasNextInt()){
            while(nao.hasNextInt()){
                number = nao.nextInt();
                listN.add(number);
            }	

            Numbers.numberMet(orden, listN);
        }else{
            while(nao.hasNextLine()){
                word = nao.nextLine();
                listS.add(word);
            }

            Strings.words(orden, listS);
        }

        nao.close();
    }
}
