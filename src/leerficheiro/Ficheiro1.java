
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
    public void lerFicheiroEnteiro(String nome){
          Scanner sc=null;
    
        String resposta;
        try {
            sc=new Scanner(new File(nome));
            while(sc.hasNext()){// mientras haya elementos los lee
                resposta=sc.next();//lee toda la linea y devuelve un string
                System.out.println(resposta);
            }
        } catch (IOException ex) { //IO exception clase xeneralista
            System.err.println("erro de lectura"+ex.toString());
        }
        finally{
            sc.close();
        }
    }
    public static void lerNumeros(String nome){
             Scanner sc=null;
    
        int res;
        try {
            sc=new Scanner(new File(nome));
            while(sc.hasNextInt()){// mientras haya elementos los lee
                res=sc.nextInt();//lee toda la linea y devuelve un Int
                System.out.println(res);
            }
        } catch (IOException ex) { //IO exception clase xeneralista
            System.err.println("erro de lectura"+ex.toString());
        }
        finally{
            sc.close();
        }
    }
    public void lerConDelimitadores(String nome){
        Scanner sc=null;
    
        int res;
        try {
            sc=new Scanner(new File(nome)).useDelimiter(",");
            while(sc.hasNextInt()){// mientras haya elementos los lee
                res=sc.nextInt();//lee toda la linea y devuelve un Int
                System.out.println(res);
            }
        } catch (IOException ex) { //IO exception clase xeneralista
            System.err.println("erro de lectura"+ex.toString());
        }
        finally{
            sc.close();
        }
    }
}
