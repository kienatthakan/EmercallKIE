package kienatthakan.snru.ac.th.emercallkie.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import kienatthakan.snru.ac.th.emercallkie.MainActivity;
import kienatthakan.snru.ac.th.emercallkie.R;

/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //  For station 1
        ImageView station1ImageView = getView().findViewById(R.id.imageViewStation1);

        //  For station 2


        //  For station 3


        //  For station 4



    }  //Main Method



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police,container,false);
        return view;
    }
}//Main Class
