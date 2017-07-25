package com.example.a15056233.c347p10knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {
    Button btnChangeColor;
    TextView tvContents;


    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_1, container, false);

        btnChangeColor = (Button) view.findViewById(R.id.buttonChangeColor);
        tvContents = (TextView) view.findViewById(R.id.TextViewContents);

        tvContents.setText("Honey is the only food that does not spoil. Honey found in the tombs of Egyptian pharaohs has been tasted by archaeologists and found edible"+
                "\n"+"\n"+"Beetles taste like apples, wasps like pine nuts, and worms  like fried bacon."+
                "\n"+"\n"+"One quarter of the bones in your body, are in your feet!"
        +"\n"+"\n"+"Some worms will eat themselves if they can't find any food!"+"\n"+"\n"+"The six official languages of the United Nations are: English, French, Arabic, Chinese, Russian and Spanish."
                        +"\n"+"\n"+"On average a hedgehog's  heart beats 300 times a minute.");

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                view.setBackgroundColor(color);
            }
        });

        return view;
    }

}
