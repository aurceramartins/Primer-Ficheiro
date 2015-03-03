
package leerficheiro;


import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ficheiro1 {
    Scanner sc;
    public void lerLinea(String nome){
        String resposta;
        try {
            sc=new Scanner(new File(nome));
            while(sc.hasNextLine()){// mientras haya elementos los lee
                resposta=sc.nextLine();//lee toda la linea y devuelve un string
                System.out.println(resposta);
            }
        } catch (IOException ex) { //IO exception clase xeneralista
            System.err.println("erro de lectura"+ex.toString());
        }
        finally{
            sc.close();
        }
    }
}
