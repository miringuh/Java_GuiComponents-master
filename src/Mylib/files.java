package Mylib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class files {
    String Filename;
   public files(String filename){
       this.Filename=filename;
   }

   public byte[] readFile()throws IOException {
       FileInputStream reads=new FileInputStream(this.Filename);
       try{
            return reads.readAllBytes();
      }catch (IOException e){
           System.out.println("ERROR "+e);
           return null;
       }finally {
          reads.close();
      }
    }
   public String writeFile(String word)throws IOException {
       try{
           FileOutputStream writes=new FileOutputStream(this.Filename);
           writes.write(word.getBytes());
           writes.close();

       }catch (IOException e){
           System.out.println("file write error");
       }
        return word;
    }

}
