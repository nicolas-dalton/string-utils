package test;

import org.junit.Test;

public class StringUtilsTestsSubsetForStudents_1_ENVIRONMENT extends StringUtilsTestsSubsetForStudents_0_STUDENT_MUST_EDIT
{
	protected String TEST_GOAL_MESSAGE;
	
	@Points(value=0)
	@Test(expected=AssertionError.class)
	public void assertionsEnabledTest()
	{
		TEST_GOAL_MESSAGE = "Check whether assertions are enabled";
		assert false;
		throw new RuntimeException("ENABLE ASSERTIONS IN RUN CONFIGURATION!");
	}
}
