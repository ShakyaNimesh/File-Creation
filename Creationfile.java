
package creationfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Creationfile {
      
    public static void main(String[] args) {
   File file = new File ("C:\\Users\\nimesh\\Desktop\\Java file creation\\Manchester united lineup.txt");
   if (!file.exists()) {
       try {
       file.createNewFile();
       } catch(IOException e) {
           System.out.println("ERROR OCURRED WHILE CREATING A NEW FILE");
       }
    }
   FileOutputStream fos= null;
   try {
       fos= new FileOutputStream(file,true);
   String msg = "/r/nMarcos Rojo /r/nMicheal Carrick /r/nAnder Herrera /r/nBastian Schweinsteger ";
   byte ab[] = msg.getBytes();
   try {
       fos.write(ab);
          } catch (IOException e) {
              System.err.println("ERROR OCCURED WHILE WRITING IN THE FILE");
          }
   }
   catch (FileNotFoundException e) {
       System.err.println("FILE NOT FOUND");
          
   } finally {
       try {fos.close();
   } catch (IOException e) {
       System.err.println("ERROR OCURRED WHILE CLOSING THE FILE");
   }
   }
    System.out.println("Writing successful");
}
}

