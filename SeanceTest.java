package ua.lviv.homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class SeanceTest {
	
	private Seance seance;
	
	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		protected void failed(Throwable e, org.junit.runner.Description description) {
			System.out.println("FAILED---> "+description.getMethodName());
		};
		protected void succeeded(org.junit.runner.Description description) {
			System.out.println("SUCCEED---> "+description.getMethodName());
		};
	};
	
	@Before
	public void beforTest() {
		seance = new Seance();
	}
	
	@After
	public void afterTest() {
		seance = null;
	}
	
	@Test
	public void addEndTime() {
		Time realTime = seance.endTime(new Time(9,30), new Time(2,25));
		Time expectedTime = new Time(11,55);	
		Assert.assertEquals(expectedTime, realTime);
	}	
}
