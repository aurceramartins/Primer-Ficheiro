package leerficheiro;

public class LeerFicheiro {

    public static void main(String[] args) {
        Ficheiro1 obx = new Ficheiro1();
        // obx.lerLinea("texto.txt");
        obx.lerLinea("C:\\Users\\Alex Urcera\\Desktop\\clase\\PROGRAMACION\\leerFicheiro\\texto.txt");
        obx.lerFicheiroEnteiro("C:\\Users\\Alex Urcera\\Desktop\\clase\\PROGRAMACION\\leerFicheiro\\texto.txt");
        Ficheiro1.lerNumeros("C:\\Users\\Alex Urcera\\Desktop\\clase\\PROGRAMACION\\leerFicheiro\\numeros.txt");
    }

}
