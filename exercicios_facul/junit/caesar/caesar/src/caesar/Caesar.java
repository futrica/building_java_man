
package caesar;

/**
 *
 * @author root
 */
public class Caesar {

    public static String misturar(String original, int desloc) {          
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";  
                     
  
        StringBuilder resultado = new StringBuilder();  
        for (char letra : original.toLowerCase().toCharArray())  
        {  
            if (letra == ' ') {  
                resultado.append(' ');  
                continue;  
            }  
              
            int pos = letra - alfabeto.charAt(0);  
            pos = (pos + desloc) % alfabeto.length();  
            if (pos < 0)  
                pos += alfabeto.length();  
            pos += alfabeto.charAt(0);  
            resultado.append((char)pos);  
        }  
        return resultado.toString();  
    }  
      
    public static void main(String [] args)  
    {  
        String txt = "rafael guimaraes sakurai";  
        System.out.println(txt);  
        String resultado = misturar(txt, 3);          
        System.out.println(resultado);    
        System.out.println(misturar(resultado, -3));  
    }  
}      
 

