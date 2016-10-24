package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import script.Script;

public class ScriptTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExecute() {
		try {
			assertEquals(2, Script.Execute("1+1"));
			assertEquals(4, Script.Execute("8/2"));
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
