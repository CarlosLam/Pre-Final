/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieUno;

/**
 *
 * @author lam_m
 */
public class ImplCesar implements cifradoCesar {

    @Override
    public String cifrarCesar(String frase, int Distancia) {
        //Variables
        String resultado = "";
        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
   
        for(int i =0; i< frase.length();i++)
        {
            //Variables
            int index;
            
            //Tomar una letra 
            String letra = frase.substring(i,i+1).toLowerCase();
            
            //Validar que no sea un espacio
            if(letra.trim().length() != 0)
            {
                //buscar en alfabeto
                index = alfabeto.indexOf(letra);
                
                //Sumar la distancia que se encuentra la letra
                index = index + Distancia;
                
                //Si el resultado se pasa del alfabeto se le resta el alfabeto
                if(index < 0)
                {
                    index = index + alfabeto.length();
                }
                else if(index > alfabeto.length())
                {
                    index = index - alfabeto.length();
                }
                
                //Añadir al resultado
                resultado = resultado + alfabeto.substring(index, index + 1);
                
            }
            else
            {
                //Solo se añade el espacio
                resultado = resultado + " ";
            }    
        }
        return resultado;
    }

    @Override
    public String cifrarCesar(String frase, String alfabeto, int distancia) {
      
        String resultado = "";
   
        for(int i =0; i< frase.length();i++)
        {
            //Variables
            int index;
            
            //Tomar una letra 
            String letra = frase.substring(i,i+1).toLowerCase();
            
            //Validar que no sea un espacio
            if(letra.trim().length() != 0)
            {
                //buscar en alfabeto
                index = alfabeto.indexOf(letra);
                
                //Sumar la distancia que se encuentra la letra
                index = index + distancia;
                
                //Si el resultado se pasa del alfabeto se le resta el alfabeto
                if(index > alfabeto.length())
                {
                    index = index - alfabeto.length();
                }
                
                //Añadir al resultado
                resultado = resultado + alfabeto.substring(index, index + 1);
                
            }
            else
            {
                //Solo se añade el espacio
                resultado = resultado + " ";
            }    
        }
        return resultado;
      
    }


    
}
