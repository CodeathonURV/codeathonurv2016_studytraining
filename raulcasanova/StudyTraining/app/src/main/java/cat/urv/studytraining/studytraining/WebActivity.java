package cat.urv.studytraining.studytraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String dataURL = intent.getStringExtra("DATA_ENTRY");

        WebView webView = (WebView) findViewById(R.id.webView_question);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(dataURL);

    }
}
