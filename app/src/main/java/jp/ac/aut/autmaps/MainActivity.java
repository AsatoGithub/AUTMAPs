package jp.ac.aut.autmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //月曜日～金曜日の講義一覧を表示する画面遷移

    public void monday(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, monday.class);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void tuesday(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, tuesday.class);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void wednesday(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, wednesday.class);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void thursday(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, thursday.class);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void friday(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, friday.class);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

}