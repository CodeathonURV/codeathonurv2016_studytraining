package cat.urv.studytraining.studytraining.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import cat.urv.studytraining.studytraining.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GlobalScoreFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class GlobalScoreFragment extends Fragment {

    private static final String KEY_NAME = "KEY_NAME";
    private static final String KEY_SCORE = "KEY_SCORE";

    private static final String[] staticName = {
            "Raúl Casanova Marqués",
            "Jordi Merino Domingo",
            "Oriol Mauri Guiu",
            "Lucia Gonzalez Abellán",
            "Irene Salvador Aguiló",
            "David Lopez Alarcón",
            "Laura Beltrán Bernat",
            "Jose Mateos Pozo"
    };

    private static final String[] staticScore = {
            "21548",
            "19845",
            "15694",
            "7568",
            "6782",
            "4526",
            "3574",
            "1555"
    };

    private OnFragmentInteractionListener mListener;

    public GlobalScoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_global_score, container, false);
        ListView listScore = (ListView) view.findViewById(R.id.listGlobalScore);

        ArrayList<HashMap<String, String>> listGlobalScoreBoard = new ArrayList<>();
        HashMap<String, String> values;
        for (int i = 0; i < staticName.length; i++) {
            values = new HashMap<>();
            values.put(KEY_NAME, staticName[i]);
            values.put(KEY_SCORE, staticScore[i]);
            listGlobalScoreBoard.add(values);
        }

        SimpleAdapter adapter = new SimpleAdapter(getActivity(), listGlobalScoreBoard, R.layout.fragment_global_score, new String[]{KEY_NAME, KEY_SCORE}, new int[]{R.id.name_GlobalScore, R.id.score_GlobalScore});
        listScore.setAdapter(adapter);


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
