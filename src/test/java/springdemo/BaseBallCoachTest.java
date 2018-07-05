package springdemo;

import com.lov2code.springdemo.BaseBallCoach;
import com.lov2code.springdemo.Coach;
import junit.framework.TestCase;

public class BaseBallCoachTest extends TestCase
{
    public void testCoach()
    {
        Coach baseBallCoach = new BaseBallCoach();
        assertEquals( "Spent 30 minutes",baseBallCoach.getDailyWorkOut() );
    }
}