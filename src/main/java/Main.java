import java.io.File;

public class Main {

    public static void main(String[] args){
        System.out.println("Mostrar lista de ficheros");
        File f = new File("/home/dam2a");
        String [] arxius = f.list();
        for (int i = 0; i <arxius.length ; i++) {
            System.out.println(arxius[i]);
        }
    }

}
