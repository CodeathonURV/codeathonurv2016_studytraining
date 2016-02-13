package cat.urv.studytraining.studytraining;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class GlobalScoreBoard extends AppCompatActivity {
    private static final String KEY_NAME = "KEY_NAME";
    private static final String KEY_SCORE = "KEY_SCORE";

    private static final String[] staticName = {
            "Raúl Casanova Marqués",
            "Jordi Merino Domingo",
            "Oriol Mauri Guiu",
            "Ana Lopez Rubio",
            "David Reyes Garcia",
            "Silvia Lopez Clotet",
            "Nuria Fernandez Diaz",
            "Diego Hernandez Castillo"
    };

    private static final String[] staticScore = {
            "12543",
            "8546",
            "7456",
            "4234",
            "3215",
            "2415",
            "1234",
            "246"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_score_board);


        ListView listScore = (ListView) findViewById(R.id.listScoreBoard);

        ArrayList<HashMap<String, String>> listScoreBoard = new ArrayList<>();
        HashMap<String, String> values;
        for (int i = 0; i < staticName.length; i++) {
            values = new HashMap<>();
            values.put(KEY_NAME, staticName[i]);
            values.put(KEY_SCORE, staticScore[i]);
            listScoreBoard.add(values);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, listScoreBoard, R.layout.activity_score_board, new String[]{KEY_NAME, KEY_SCORE}, new int[]{R.id.name_ScoreBoard, R.id.score_ScoreBoard});
        listScore.setAdapter(adapter);
    }
}
