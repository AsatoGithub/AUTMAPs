package jp.ac.aut.autmaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //月曜日
    private static final String M1 = "M1";
    private EditText editm1;
    private static final String M2 = "M2";
    private EditText editm2;
    private static final String M3 = "M3";
    private EditText editm3;
    private static final String M4 = "M4";
    private EditText editm4;
    //火曜日
    private static final String TU1 = "TU1";
    private EditText edittu1;
    private static final String TU2 = "TU2";
    private EditText edittu2;
    private static final String TU3 = "TU3";
    private EditText edittu3;
    private static final String TU4 = "TU4";
    private EditText edittu4;
    //水曜日
    private static final String WE1 = "WE1";
    private EditText editwe1;
    private static final String WE2 = "WE2";
    private EditText editwe2;
    private static final String WE3 = "WE3";
    private EditText editwe3;
    private static final String WE4 = "WE4";
    private EditText editwe4;
    //木曜日
    private static final String TH1 = "TH1";
    private EditText editth1;
    private static final String TH2 = "TH2";
    private EditText editth2;
    private static final String TH3 = "TH3";
    private EditText editth3;
    private static final String TH4 = "TH4";
    private EditText editth4;
    //金曜日
    private static final String FR1 = "FR1";
    private EditText editfr1;
    private static final String FR2 = "FR2";
    private EditText editfr2;
    private static final String FR3 = "FR3";
    private EditText editfr3;
    private static final String FR4 = "FR4";
    private EditText editfr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        //共有プリファレンスから保存した値を取得
        //月曜日
        String m1 = pref.getString(M1, "");
        String m2 = pref.getString(M2, "");
        String m3 = pref.getString(M3, "");
        String m4 = pref.getString(M4, "");
        //火曜日
        String tu1 = pref.getString(TU1, "");
        String tu2 = pref.getString(TU2, "");
        String tu3 = pref.getString(TU3, "");
        String tu4 = pref.getString(TU4, "");
        //水曜日
        String we1 = pref.getString(WE1, "");
        String we2 = pref.getString(WE2, "");
        String we3 = pref.getString(WE3, "");
        String we4 = pref.getString(WE4, "");
        //木曜日
        String th1 = pref.getString(TH1, "");
        String th2 = pref.getString(TH2, "");
        String th3 = pref.getString(TH3, "");
        String th4 = pref.getString(TH4, "");
        //金曜日
        String fr1 = pref.getString(FR1, "");
        String fr2 = pref.getString(FR2, "");
        String fr3 = pref.getString(FR3, "");
        String fr4 = pref.getString(FR4, "");

        //値格納
        //月曜日
        editm1 = (EditText)findViewById(R.id.m1);
        editm2 = (EditText)findViewById(R.id.m2);
        editm3 = (EditText)findViewById(R.id.m3);
        editm4 = (EditText)findViewById(R.id.m4);
        //火曜日
        edittu1 = (EditText)findViewById(R.id.tu1);
        edittu2 = (EditText)findViewById(R.id.tu2);
        edittu3 = (EditText)findViewById(R.id.tu3);
        edittu4 = (EditText)findViewById(R.id.tu4);
        //水曜日
        editwe1 = (EditText)findViewById(R.id.we1);
        editwe2 = (EditText)findViewById(R.id.we2);
        editwe3 = (EditText)findViewById(R.id.we3);
        editwe4 = (EditText)findViewById(R.id.we4);
        //木曜日
        editth1 = (EditText)findViewById(R.id.th1);
        editth2 = (EditText)findViewById(R.id.th2);
        editth3 = (EditText)findViewById(R.id.th3);
        editth4 = (EditText)findViewById(R.id.th4);
        //金曜日
        editfr1 = (EditText)findViewById(R.id.fr1);
        editfr2 = (EditText)findViewById(R.id.fr2);
        editfr3 = (EditText)findViewById(R.id.fr3);
        editfr4 = (EditText)findViewById(R.id.fr4);

        //EditTextビューに表示
        //月曜日
        editm1.setText(m1);
        editm2.setText(m2);
        editm3.setText(m3);
        editm4.setText(m4);
        //火曜日
        edittu1.setText(tu1);
        edittu2.setText(tu2);
        edittu3.setText(tu3);
        edittu4.setText(tu4);
        //水曜日
        editwe1.setText(we1);
        editwe2.setText(we2);
        editwe3.setText(we3);
        editwe4.setText(we4);
        //木曜日
        editth1.setText(th1);
        editth2.setText(th2);
        editth3.setText(th3);
        editth4.setText(th4);
        //金曜日
        editfr1.setText(fr1);
        editfr2.setText(fr2);
        editfr3.setText(fr3);
        editfr4.setText(fr4);



    }


    public void onSaveTapped(View view) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();
        //EditTextビューに設定されている値を共有プリファレンスに保存
        //月曜日
        editor.putString(M1, editm1.getText().toString());
        editor.putString(M2, editm2.getText().toString());
        editor.putString(M3, editm3.getText().toString());
        editor.putString(M4, editm4.getText().toString());
        //火曜日
        editor.putString(TU1, edittu1.getText().toString());
        editor.putString(TU2, edittu2.getText().toString());
        editor.putString(TU3, edittu3.getText().toString());
        editor.putString(TU4, edittu4.getText().toString());
        //水曜日
        editor.putString(WE1, editwe1.getText().toString());
        editor.putString(WE2, editwe2.getText().toString());
        editor.putString(WE3, editwe3.getText().toString());
        editor.putString(WE4, editwe4.getText().toString());
        //木曜日
        editor.putString(TH1, editth1.getText().toString());
        editor.putString(TH2, editth2.getText().toString());
        editor.putString(TH3, editth3.getText().toString());
        editor.putString(TH4, editth4.getText().toString());
        //金曜日
        editor.putString(FR1, editfr1.getText().toString());
        editor.putString(FR2, editfr2.getText().toString());
        editor.putString(FR3, editfr3.getText().toString());
        editor.putString(FR4, editfr4.getText().toString());

        editor.commit();
    }




    public void route(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, route.class);
        startActivity(intent);
    }
}