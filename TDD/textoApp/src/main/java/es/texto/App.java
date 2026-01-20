package es.texto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("inicio");
    	try {
    		 Texto t = new Texto(null,4);
    	}catch(IllegalArgumentException ex){
    		System.err.println(ex.toString());
    	}
       
        System.out.println("fin");
    }
}
