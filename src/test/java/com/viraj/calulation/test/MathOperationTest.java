/**
 * 
 */
package com.viraj.calulation.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.viraj.calculation.MathOperation;

/**
 * @author easyreach
 *
 */
public class MathOperationTest {

	MathOperation mathOperation =null;

	@Before
	public void preProcess() {
		mathOperation = new MathOperation();
	}

	@Test
	public void caseOne() {
		assertEquals(15, mathOperation.add(10, 5));
	}


	@Test
	public void caseTwo() {

		assertEquals(5, mathOperation.sub(10, 5));
	}


	@After
	public void postProcess(){
		mathOperation = null;
	}

}
