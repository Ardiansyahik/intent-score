package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
private TextView homeText;
private TextView awayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        homeText =findViewById(R.id.score_home);
        awayText = findViewById(R.id.score_away);

    Bundle extras =getIntent().getExtras();
        if(extras !=null){
        }
    }
}
