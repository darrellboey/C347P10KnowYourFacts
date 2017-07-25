package com.example.a15056233.c347p10knowyourfacts;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    ImageView iv;
    Button btnImgChange;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_2, container, false);

        iv = (ImageView) view.findViewById(R.id.iv);
        btnImgChange = (Button) view.findViewById(R.id.buttonImageChanged );


        btnImgChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imageUrl = "http://68.media.tumblr.com/a3664102423c3598d286dbabbf868892/tumblr_mujarlMHnY1roqv59o1_500.png";
                Picasso.with(getActivity()).load(imageUrl).into(iv);
            }
        });


        return view;
    }

}
