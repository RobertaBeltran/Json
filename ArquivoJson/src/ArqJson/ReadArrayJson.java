
package ArqJson;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadArrayJson {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileReader fr = new FileReader("arrayjson.json");
        BufferedReader br = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder(); 
        String line;
        while((line = br.readLine()) != null){
             sb = sb.append(line);
             System.out.println(sb);
        }
           
        br.close();
        fr.close();

    }
}
