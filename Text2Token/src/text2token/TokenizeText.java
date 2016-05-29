/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text2token;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import text2token.TokenizeText;

public class TokenizeText {
    
    private String FileName;
    private ArrayList<String> tokens = new ArrayList();
    private String linha;
    private String token;
    private String delimitador = " .!,?;:_()[]$-@~/*#&\"";
    private StringTokenizer tokenizer;
    private BufferedReader input = null;
    
    public TokenizeText(){
        //constructor pobre
    }
    
    void setFileName(String filename){
        this.FileName = filename;
    }
    
    String getFileName(){
        return this.FileName;
    }
    
    //devolver resultado
    ArrayList<String> getAllTokens(){
        return this.tokens;
    }
    
    void tokenizeTxt() throws FileNotFoundException, IOException{
        input = new BufferedReader(new FileReader(this.FileName));
        linha = input.readLine();

        while (linha != null){
            tokenizer = new StringTokenizer(linha, " \t");
            while (tokenizer.hasMoreTokens()){
              token = tokenizer.nextToken();
              tokens.add(token);
            }
            linha = input.readLine();
        }
    }
    
    void printAllTokens(){
        int i;
        for(i=0; i < tokens.size(); i++){
            System.out.println(tokens.get(i));
        }
    }
}
