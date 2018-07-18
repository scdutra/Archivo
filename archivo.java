import java.io.FileInputStream;
import javax.swing.text.rtf.RTFEditorKit;
import javax.swing.text.Document;
import java.io.IOException;

public class archivo {

   public static void main(String[] args)throws IOException {
     String text;
     System.out.println("comienza");
     
     try {
     text = arc();  
     
     System.out.print (text);
     }
     catch (Exception e) {}
   }
   
   public static String arc() throws IOException{
      try{
         FileInputStream stream = new FileInputStream("C://users/seba/documents/programas/java/archivo/prueba.rtf");
         RTFEditorKit kit = new RTFEditorKit();
         Document doc = kit.createDefaultDocument();
         kit.read(stream, doc, 0);
         System.out.println (doc.getLength());
          
         String plainText = doc.getText(0, doc.getLength());
         System.out.println("text" + plainText);
         return plainText;
      }
      catch (Exception e) {
         return "void";
      }
   }
}