package org.kefirsf.bb.test;

import org.kefirsf.bb.TextProcessor;

/**
 * Class contains static assert methods
 *
 * @author Kefir
 */
public class Assert extends org.junit.Assert {
    /**
     * Protected constructor. Only for extends by static classes.
     *
     * @throws UnsupportedOperationException always
     */
    protected Assert() {
        super();
        throw new UnsupportedOperationException();
    }

    /**
     * Assert process result with target text.
     *
     * @param processor text processor
     * @param expected  expected process result
     * @param source    source text
     */
    public static void assertProcess(TextProcessor processor, String expected, CharSequence source) {
        assertEquals(expected, processor.process(source).toString());
    }
}
