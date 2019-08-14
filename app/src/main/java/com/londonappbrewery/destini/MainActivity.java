package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mButtonT1A1;
    private Button mButtonT1A2;
    private TextView mTextViewT1S1;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mButtonT1A1 = (Button) findViewById(R.id.buttonTop);
        mButtonT1A2 = (Button) findViewById(R.id.buttonBottom);
        mTextViewT1S1 = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonT1A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1 || mStoryIndex == 2) {

                    mButtonT1A1.setText(R.string.T3_Ans1);
                    mButtonT1A2.setText(R.string.T3_Ans2);
                    mTextViewT1S1.setText(R.string.T3_Story);
                    mStoryIndex = 3;
                } else {
                    mTextViewT1S1.setText(R.string.T6_End);
                    mButtonT1A1.setVisibility(View.GONE);
                    mButtonT1A2.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonT1A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "T1A2");


                if (mStoryIndex == 1) {
                    mButtonT1A1.setText(R.string.T2_Ans1);
                    mButtonT1A2.setText(R.string.T2_Ans2);
                    mTextViewT1S1.setText(R.string.T2_Story);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mTextViewT1S1.setText(R.string.T4_End);
                    mButtonT1A1.setVisibility(View.GONE);
                    mButtonT1A2.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {

                    mTextViewT1S1.setText(R.string.T5_End);

                    mButtonT1A1.setVisibility(View.GONE);
                    mButtonT1A2.setVisibility(View.GONE);
                }


            }
        });


    }



}



















