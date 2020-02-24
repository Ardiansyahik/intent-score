package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MatchActivity extends AppCompatActivity {
private TextView homeText;
private TextView awayText;

private TextView homeTextscore;
private TextView awayTextscore;

private int homescore;
private int awayscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        //TODO
        //1.Menampilkan detail match sesuai data dari main activity
        //2.Tombol add score menambahkan satu angka dari angka 0, setiap kali di tekan
        //3.Tombol Cek Result menghitung pemenang dari kedua tim dan mengirim nama pemenang ke ResultActivity, jika seri di kirim text "Draw"
        homeText = findViewById(R.id.txt_home);
        awayText = findViewById(R.id.txt_away);
        homeTextscore = findViewById(R.id.score_home);
        awayTextscore = findViewById(R.id.score_home);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String home = extras.getString(MainActivity.HOME_KEY);
            String away = extras.getString(MainActivity.AWAY_KEY);
            homeText.setText(home);
            awayText.setText(away);
        }
    }

    public void handlehome(View view) {
        homescore++;
        homeTextscore.setText(String.valueOf(homescore));
    }

    public void handleaway(View view) {
        awayscore++;
        awayTextscore.setText(String.valueOf(awayscore));
    }
}
