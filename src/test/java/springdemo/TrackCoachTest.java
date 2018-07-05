package springdemo;

import com.lov2code.springdemo.Coach;
import com.lov2code.springdemo.TrackCoach;
import junit.framework.TestCase;

public class TrackCoachTest extends TestCase
{
    public void testCoach()
    {
        Coach trCoach = new TrackCoach();
        assertEquals( "\n\nget the massagetrack coach\n\n\n",trCoach.getDailyWorkOut() );
    }

}