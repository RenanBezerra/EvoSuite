/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 27 00:02:24 GMT 2021
 */

package calculadora;

import static org.junit.Assert.assertEquals;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CalculadoraDeImposto_ESTest extends CalculadoraDeImposto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(873.558773105492);
      assertEquals(1310.338159658238, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota((-1259.07242));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(1000.01);
      assertEquals(1100.011001490131, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(2500.01);
      assertEquals(2875.011514901221, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(1000.0002656587573);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(2500.0);
      assertEquals(2750.0000037252903, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(4000.0);
      assertEquals(4600.000023841858, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(4600.000023841858);
      assertEquals(5612.000023603439, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CalculadoraDeImposto calculadoraDeImposto0 = new CalculadoraDeImposto();
      double double0 = calculadoraDeImposto0.calculoAliquota(1000.0);
      assertEquals(1500.0, double0, 0.01);
  }
}