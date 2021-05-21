/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import prestamo.Prestamo;


/**
 *
 * @author danielreguera
 * 
 * 
 * NOTA: he quitado llaves, intentado imports, pero nada... se me resiste esta prueba :(
 */
public class Parametrizada {
    

    @RunWith(value=Parameterized.class)
    public Parametrizada() {
        private int a;
        private String resultado;
    }

    public PrestamoParametroTest(int a, String resultado) {
        this.a = a;
        this.resultado = resultado;
    }

    @Parameters
    public static Iterable<Object[]> getData() {
         List<Object[]> obj = new ArrayList<>();
            //objetos de preubas borde
         obj.add(new Object[] {1000,"Felicidades, préstamo concedido"});
         obj.add(new Object[] {15000,"Felicidades, préstamo concedido"});

         obj.add(new Object[] {1000,"Felicidades, préstamo concedido"});
         obj.add(new Object[] {1000,"Felicidades, préstamo concedido"});
         obj.add(new Object[] {1000,"Felicidades, préstamo concedido"});

         return obj;
    }
        
    @Test
    public void testAdd(){
        System.out.println("ingreso");
        int cantidad = a;
        Prestamo instance = new Prestamo();
        String expResult = resultado;
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result); 
    }
        
        
        
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
