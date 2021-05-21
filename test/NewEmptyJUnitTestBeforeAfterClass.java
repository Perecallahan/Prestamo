/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import prestamo.Prestamo;

/**
 *
 * @author danielreguera
 */

/**
 * 
            } "Felicidades, préstamo concedido";
            * 
                "Préstamo no concedido carece de interes"; 500
            } "Préstamo no concedido es una operación con demasiado riesgo"; 20000
 */
public class NewEmptyJUnitTestBeforeAfterClass {
    
    public NewEmptyJUnitTestBeforeAfterClass() {
    }
    
    private static Prestamo instance;
   
   @Before
    public void Before() {
    System.out.println("Before");
    instance = new Prestamo();
    }
  
    @After
    public void After() {
        System.out.println("After");
        instance = null;
    }
  
  
  @Test
  public void borde1() {
    System.out.println("Cantidad: 1000");
    int cantidad = 1000;
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
  }
  
  @Test
  public void borde2() {
    System.out.println("Cantidad: 15000");
    int cantidad = 15000;
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
  }
  
  @Test
  public void equiv1() {
    System.out.println("Cantidad: 500");
    int cantidad = 500;
    String expResult = "Préstamo no concedido carece de interes";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
  }
  
  @Test
  public void equiv2() {
    System.out.println("Cantidad: 20000");
    int cantidad = 20000;
    String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
  }
  
  @Test
  public void equiv3() {
    System.out.println("Cantidad: 10000");
    int cantidad = 10000;
    String expResult = "Felicidades, préstamo concedido";
    String result = instance.estudio(cantidad);
    assertEquals(expResult, result);
  }
 
    

  
  
  
  
  
  
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
