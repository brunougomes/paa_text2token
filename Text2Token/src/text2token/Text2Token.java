package text2token;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import sun.misc.IOUtils;
import text2token.TokenizeText;

public class Text2Token {
    
    public static void main(String[] args) throws IOException {
        TokenizeText tokenizer = new TokenizeText();
        
        File folder = new File("src/texts");
        File[] listOfFiles = folder.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String absolutePath = listOfFiles[i].getAbsolutePath(); 
                tokenizer.setFileName(absolutePath);
                tokenizer.tokenizeTxt();
            }
        }
        
        tokenizer.printAllTokens();
    }
}
