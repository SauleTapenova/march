package Second.Dod;
import java.io.*;
public class dod {
   
 

  
    public static void main(String[] args) {
        String text = ""; 
        
        try(FileOutputStream fos=new FileOutputStream("notes.txt"))
        {
            
            byte[] buffer = text.getBytes();
              
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        }
    }
}

