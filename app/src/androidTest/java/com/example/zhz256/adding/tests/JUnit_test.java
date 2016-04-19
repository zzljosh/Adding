package com.example.zhz256.adding.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.example.zhz256.adding.MainActivity;
import com.example.zhz256.adding.R;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by zhz256 on 4/18/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    TextView textView1;
    TextView textView2;
    TextView textView3;
    Button btn;
    String tester;

    @Before
    public void prepare(){
        mainActivity = getActivity();

        textView1 = (TextView)mainActivity.findViewById(R.id.number1);
        textView2 = (TextView)mainActivity.findViewById(R.id.number2);
        textView3 = (TextView)mainActivity.findViewById(R.id.sum);
        btn = (Button)mainActivity.findViewById(R.id.button);

    }

    @Test
    public void test1(){
        textView1.append("5");
        textView2.append("100");
        btn.performClick();
        tester = textView3.getText().toString();
        assertEquals("105", tester);
    }

    @Test
    public void test2(){
        textView1.append("-5");
        textView2.append("-100");
        btn.performClick();
        tester = textView3.getText().toString();
        assertEquals("-105", tester);
    }

    @Test
    public void test3(){
        textView1.append("5");
        textView2.append("-100");
        btn.performClick();
        tester = textView3.getText().toString();
        assertEquals("-95", tester);
    }

    @Test
    public void test4(){
        textView1.append("-5");
        textView2.append("100");
        btn.performClick();
        tester = textView3.getText().toString();
        assertEquals("95", tester);
    }
}
