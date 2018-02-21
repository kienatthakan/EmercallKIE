package kienatthakan.snru.ac.th.emercallkie.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import kienatthakan.snru.ac.th.emercallkie.MainActivity;
import kienatthakan.snru.ac.th.emercallkie.R;


/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment{

    //   Explicit
    private String tag = "MyTagV1";


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //      For station 1
        ImageView station1ImageView = getView().findViewById(R.id.imageViewStation1);
        station1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(tag, "You click Image station1");
                callStation("1111");

            }
        });

        TextView station1TextView =getView().findViewById(R.id.textViewStation1);
        station1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d (tag, "click Text" + getString(R.string.station1));
                callStation("1111");
            }
        });

        //      For station 2


        //      For station 3


        //      For station 4



    }  //Main Method

    public void callStation(String numberCall){

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:=" + numberCall));
        startActivity(intent);


    } // callStation



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police,container,false);
        return view;
    }
}//Main Class
