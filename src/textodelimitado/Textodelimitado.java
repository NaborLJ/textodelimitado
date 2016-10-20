
package textodelimitado;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Textodelimitado {

    public static void main(String[] args) throws IOException {
        String[] cod={"p1","p2","p3"};
        String[] desc ={"parafusos","cravos","tachas"};
        Double[] prezo ={3.0,4.0,5.0};
        
        File texto = new File("productos.txt");
        texto.createNewFile();
        
        PrintWriter printer = new PrintWriter("productos.txt");
        for(int i = 0;i<cod.length;i++){
            printer.print(cod[i]+"\t");
            printer.print(desc[i]+"\t");
            printer.println(prezo[i]);
        }
               
        
        printer.close();
        
        FileReader reader = new FileReader("/home/oracle/NetBeansProjects/textodelimitado/productos.txt");
        BufferedReader br = new BufferedReader(reader);
        
        for(int x = 0;x<3;x++){
        String aux ="";
        aux=br.readLine();
        String[] auxx = aux.split("\t");
        
        System.out.println(new Product(auxx[0],auxx[1],Double.parseDouble(auxx[2])));
        
        }
        
        
        
        
        
    }
    
}
