package jp.ac.aut.autmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class friday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);
    }

    public void netkeiro(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //7号館への経路を表示するためにkeyに1を渡す
        intent.putExtra("key",1);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }


/*
    public void netkeiro1(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("key",2);
         // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void netkeiro2(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("key",3);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

 */
}