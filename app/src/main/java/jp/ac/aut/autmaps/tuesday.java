package jp.ac.aut.autmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tuesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);
    }


    public void netkeiro(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //4号館への経路を表示するためにkeyに2を渡す
        intent.putExtra("key",2);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void netkeiro1(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //6号館への経路を表示するためにkeyに3を渡す
        intent.putExtra("key",3);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }
}