package arqudir;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author oracle
 */                                                
public class Arqudir {
   
    public static void main(String[] args) {
       
        
        //creacion del directorio arquivos
        File directorio1=new File("/home/oracle/NetBeansProjects/arquivos");
        if (directorio1.exists()){
        System.out.println("O Directorio xa existe");
        }else directorio1.mkdir();
        
        
        
        //1.Creacion del directorio arquivosdir denstro de la carpeta arquivos comprobando si existen
        File directorio2=new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        if (directorio2.exists()){
        System.out.println("O Directorio xa existe");
        }else directorio2.mkdir();
        
        
       String ficherot= "/home/oracle/NetBeansProjects/arquivos/arquivosdir/products1.txt";
        
        //2.creacion del fichero comprobando si existen
        File fichero= new File(ficherot);
        try {
            if(fichero.exists())
            System.out.println("O ficheiro xa esxiste");
            else fichero.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Arqudir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //4.Creacion del directorio subdir y fichero products2.txt
        File subdirect=new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        File fichero2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir","products2.txt");
        if (subdirect.exists()){
        System.out.println("O Directorio xa existe");
        }else subdirect.mkdir();
        if (fichero2.exists())
            System.out.println("O ficheiro xa existe");
        else try {
            fichero2.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Arqudir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //5.Mostrar lo que hay dentro de arquivosdir
        String[] array=directorio2.list();
        for (String array1 : array) {
            System.out.println(array1);
        }
        
        //6.Mostrar la ruta del primer directorio creado
        System.out.println("A ruta do directorio "+directorio1.getName()+" é: "+directorio1.getPath());
        
        
        /**7.Mostrar nome e ruta do primer archivo e cantos bytes conten o ficheiro*/
        
        System.out.println("O primer archivo chamase: "+fichero.getName());
        System.out.println("e ten a ruta: "+fichero.getPath());
            if(fichero.canWrite())
                System.out.println("Podese escribir no archivo "+fichero.getName());
            else System.out.println("Non se pode escribir no archivo "+fichero.getName());
            if(fichero.canRead())
                System.out.println("Podese leer o archivo "+fichero.getName());
            else System.out.println("Non se pode leer o archivo "+fichero.getName());
            
            System.out.println("A lonxitude no ficheiro "+fichero.getName()+" é "+fichero.length()+" bytes");
            
            
        //8.O ficheiro será só de lectura
            
           // fichero.setReadable(true);
           // fichero.setWritable(false);
            
        //9.O ficheiro será de lectura é escritura    
           // fichero.setReadable(true);
           // fichero.setWritable(true);
            
            
        //10. Borrar o archivo
            
           if(fichero.delete()){
           System.out.println("O ficherio foi borrado");
            ficherot=ficherot+"~";
            File ff= new File(ficherot);
            ff.delete();}
            else System.out.println("o ficheiro non pode ser borrado");
            
       //11. Borrar todos os archivos e directorios creados anteriormente
            
            if(fichero2.delete())
                System.out.println("O ficherio foi borrado");
            
            else System.out.println("o ficheiro non pode ser borrado");
            
            
                 if(subdirect.delete())
                System.out.println("O subdirectorio foi borrado");
            else System.out.println("o subdirectorio non pode ser borrado");  
            
             if(directorio2.delete())
                System.out.println("O directorio2 foi borrado");
            else System.out.println("o directorio2 non pode ser borrado");
            
            
             if(directorio1.delete())
                System.out.println("O directorio1 foi borrado");
            else System.out.println("o directorio1 non pode ser borrado");
}
}
