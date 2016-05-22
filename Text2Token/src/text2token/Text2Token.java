
package text2token;
import java.io.IOException;
import text2token.TokenizeText;

public class Text2Token {

    public static void main(String[] args) throws IOException {
        TokenizeText tokenizer = new TokenizeText();
        tokenizer.setFileName("C:\\Users\\Bru\\Documents\\NetBeansProjects\\Text2Token\\src\\texts\\texto.txt");
        tokenizer.tokenizeTxt();
        tokenizer.printAllTokens();
    }
    
}
