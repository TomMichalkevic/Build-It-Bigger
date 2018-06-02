package com.tomasmichalkevic.builditbigger;

import com.udacity.gradle.builditbigger.*;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {

    @Test
    public void testAsyncTask() {
        EndpointsAsyncTask endpointAsyncTask = new EndpointsAsyncTask();
        try {
            String result = endpointAsyncTask.execute().get();
            boolean haveAJoke = false;
            if(result.length()>0){
                haveAJoke = true;
            }
            Assert.assertEquals(haveAJoke, true);
        } catch (InterruptedException | ExecutionException e) {
            Log.e("TESTING", "testAsyncTask: ", e);
        }
    }
}
