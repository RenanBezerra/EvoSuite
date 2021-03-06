/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 27 00:02:45 GMT 2021
 */

package biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Livro_ESTest extends Livro_ESTest_scaffolding {

	@Test(timeout = 4000)
	public void test00() throws Throwable {
		Livro livro0 = new Livro();
		float float0 = livro0.getValorCompra();
		assertEquals(0.0F, float0, 0.01F);
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		livro0.setValorCompra(436.99545F);
		float float0 = livro0.getValorCompra();
		assertEquals(436.99545F, float0, 0.01F);
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		Livro livro0 = new Livro(2409, "", "g$/;Egp$ KYQ^A`T*", "biblioteca.Livro", 2409, 2409);
		String string0 = livro0.getTitulo();
		assertEquals(2409, livro0.getNumPaginas());
		assertEquals(2409, livro0.getCodigo());
		assertEquals(2409.0F, livro0.getValorCompra(), 0.01F);
		assertEquals("biblioteca.Livro", livro0.getAutor());
		assertEquals("g$/;Egp$ KYQ^A`T*", string0);
		assertEquals("", livro0.getISBN());
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		Livro livro0 = new Livro((-379), "", "", "", 1160, 0.0F);
		livro0.getTitulo();
		assertEquals((-379), livro0.getCodigo());
		assertEquals(0.0F, livro0.getValorCompra(), 0.01F);
		assertEquals(1160, livro0.getNumPaginas());
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		Livro livro0 = new Livro();
		livro0.setNumPaginas((-866));
		int int0 = livro0.getNumPaginas();
		assertEquals((-866), int0);
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		Livro livro0 = new Livro();
		String string0 = livro0.getISBN();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		Livro livro0 = new Livro();
		int int0 = livro0.getCodigo();
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		livro0.setCodigo(2706);
		int int0 = livro0.getCodigo();
		assertEquals(2706, int0);
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		Livro livro0 = new Livro(0, "", "", "c", 0, 0.0F);
		String string0 = livro0.getAutor();
		assertEquals(0, livro0.getCodigo());
		assertEquals("", livro0.getISBN());
		assertEquals(0.0F, livro0.getValorCompra(), 0.01F);
		assertEquals(0, livro0.getNumPaginas());
		assertEquals("c", string0);
		assertEquals("", livro0.getTitulo());
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		Livro livro0 = new Livro();
		livro0.setAutor("");
		String string0 = livro0.getAutor();
		assertEquals("", string0);
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		livro0.setTitulo((String) null);
		assertEquals(991, livro0.getNumPaginas());
		assertEquals((-228.0F), livro0.getValorCompra(), 0.01F);
		assertEquals((-1), livro0.getCodigo());
	}

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		livro0.setNumPaginas(0);
		int int0 = livro0.getNumPaginas();
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		Livro livro0 = new Livro();
		livro0.setISBN("3]N ^U#V)?7w=e?");
		String string0 = livro0.getISBN();
		assertEquals("3]N ^U#V)?7w=e?", string0);
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		float float0 = livro0.getValorCompra();
		assertEquals((-228.0F), float0, 0.01F);
		assertEquals(991, livro0.getNumPaginas());
		assertEquals((-1), livro0.getCodigo());
	}

	@Test(timeout = 4000)
	public void test14() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		String string0 = livro0.getISBN();
		assertNotNull(string0);
		assertEquals(991, livro0.getNumPaginas());
		assertEquals((-228.0F), livro0.getValorCompra(), 0.01F);
		assertEquals((-1), livro0.getCodigo());
	}

	@Test(timeout = 4000)
	public void test15() throws Throwable {
		Livro livro0 = new Livro();
		String string0 = livro0.getTitulo();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void test16() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		int int0 = livro0.getNumPaginas();
		assertEquals((-1), livro0.getCodigo());
		assertEquals((-228.0F), livro0.getValorCompra(), 0.01F);
		assertEquals(991, int0);
	}

	@Test(timeout = 4000)
	public void test17() throws Throwable {
		Livro livro0 = new Livro((-1), "", (String) null, "", 991, (-228.0F));
		int int0 = livro0.getCodigo();
		assertEquals(991, livro0.getNumPaginas());
		assertEquals((-228.0F), livro0.getValorCompra(), 0.01F);
		assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void test18() throws Throwable {
		Livro livro0 = new Livro();
		String string0 = livro0.getAutor();
		assertNull(string0);
	}
}
