import com.rtfparserkit.parser.*;

public class main implements IRtfSource{

      public void main(){
         
         InputStream is = new FileInputStream("prueba.rtf");
         IRtfSource source = new RtfStreamSource(is);
         IRtfParser parser = new StandardRtfParser();
         MyRtfListener listener = new MyRtfListener();
         parser.parse(source, listener);
      }


}