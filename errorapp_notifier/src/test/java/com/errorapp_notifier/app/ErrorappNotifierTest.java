package com.errorapp_notifier.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ErrorappNotifierTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ErrorappNotifierTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ErrorappNotifierTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testErrorappNotifier()
    {
        assertTrue( true );
    }
}
