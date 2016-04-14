package com.example.niralpathak.lab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.niralpathak.lab3.MyActivity;
import com.example.niralpathak.lab3.R;

/**
 * Created by niralpathak on 4/14/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity>
{
    MyActivity myActivity;

    public JUnit_test()
    {
        super(MyActivity.class);
    }

    public void test_first()
    {
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
