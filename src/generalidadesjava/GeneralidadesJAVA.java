
package generalidadesjava;


public class GeneralidadesJAVA {


    public static void main(String[] args) {
        //1- variables
        String Grupo = "2b";
        
        
        Saludar();
        System.out.println( sumar(5, 8) );
        
    }
    //2- metodos y funciones(fuera del metodo main)
    // metodo
    public static void Saludar(){
        //para imprimir en consola
        System.out.println("Hola mundo");
        
    }
    
    //2.1 metodo que retorna un valor
    public static String despedirse(){
        String despedida = "Adios mundo";
        return despedida;
                
    }
    
    //2.2 argumentos y parametros
    public static int sumar(int num1, int num2/*argumentos*/){
        int resultado = (num1 + num2);
        return resultado;
      
    }
}
