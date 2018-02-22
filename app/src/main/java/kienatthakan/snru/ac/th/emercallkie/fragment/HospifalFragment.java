package kienatthakan.snru.ac.th.emercallkie.fragment;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import kienatthakan.snru.ac.th.emercallkie.R;
import kienatthakan.snru.ac.th.emercallkie.utility.HospitalAdapter;

/**
 * Created by Admin on 22/2/2561.
 */

public class HospifalFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView
        ListView listView = getView().findViewById(R.id.lisViewHopotal);

        int[]ints =new int[]{R.drawable.station1,R.drawable.station2,

                R.drawable.station3,R.drawable.station4, R.drawable.station1,
                R.drawable.station2,R.drawable.station3,R.drawable.station4};

        String[]titleStrings = new String[]{"Hospital 1","Hospital 2","Hospital 3","Hospital 4",
                "Hospital 5","Hospital 6","Hospital 7","Hospital 8",};

        String[] phoneString = new String []{"1111", "1112", "1113", "1114", "1115", "1116",
                "1117", "1118"};

        HospitalAdapter hospitalAdapter = new HospitalAdapter(getActivity(), ints, titleStrings, phoneString);
        listView.setAdapter(hospitalAdapter);



    }   //    Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hospital,container,false);
        return view;
    }
} // Main Class
