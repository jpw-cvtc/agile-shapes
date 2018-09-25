package org.cvtc.shapes.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.cvtc.shapes.Shape;
import org.junit.Test;

public class ShapeTest {

	@Test
	public void testIsValueGreaterThanZero() {
		assertTrue(Shape.isValueGreaterThanZero(1));
		assertFalse(Shape.isValueGreaterThanZero(-1));
	}

}
