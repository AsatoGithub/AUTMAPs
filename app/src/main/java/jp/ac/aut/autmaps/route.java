package jp.ac.aut.autmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class route extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
    }

    public void one(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //1号館への経路を表示するためにkeyに1を渡す
        intent.putExtra("key",1);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void two(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //2号館への経路を表示するためにkeyに2を渡す
        intent.putExtra("key",2);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void three(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //3号館への経路を表示するためにkeyに3を渡す
        intent.putExtra("key",3);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }
    public void four(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //4号館への経路を表示するためにkeyに4を渡す
        intent.putExtra("key",4);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }
    public void five(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //5号館への経路を表示するためにkeyに5を渡す
        intent.putExtra("key",5);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void six(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //6号館への経路を表示するためにkeyに6を渡す
        intent.putExtra("key",6);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void seven(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //7号館への経路を表示するためにkeyに7を渡す
        intent.putExtra("key",7);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void eight(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //8号館への経路を表示するためにkeyに8を渡す
        intent.putExtra("key",8);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }

    public void gym(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //体育館への経路を表示するためにkeyに10を渡す
        intent.putExtra("key",10);
        // アクティビティを起動（画面遷移）
        startActivity(intent);
    }
}