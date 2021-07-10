package jp.ac.aut.autmaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.annotation.NonNull;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.widget.TextView;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;
import android.Manifest;


public class route extends AppCompatActivity implements LocationListener {

    LocationManager locationManager;
    public String str1;
    public String str2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_route);

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION,},
                    1000);
        }
        else {
            locationStart();

            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                    1000, 50, this);

        }
    }

    private void locationStart(){
        Log.d("debug","locationStart()");

        // LocationManager インスタンス生成
        locationManager =
                (LocationManager) getSystemService(LOCATION_SERVICE);

        if (locationManager != null && locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            Log.d("debug", "location manager Enabled");
        } else {
            // GPSを設定するように促す
            Intent settingsIntent =
                    new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(settingsIntent);
            Log.d("debug", "not gpsEnable, startActivity");
        }

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);

            Log.d("debug", "checkSelfPermission false");
            return;
        }

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                1000, 50, this);

    }




    public void one(View view) {
        // Intentクラスのインスタンスを生成
        Intent intent = new Intent(this, MapsActivity.class);
        //1号館への経路を表示するためにkeyに1を渡す
        intent.putExtra("key",1);
        //GPSから取得した現在地座標をMapsActivityクラスに渡す
        intent.putExtra("gps1",str1);
        intent.putExtra("gps2",str2);
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

    @Override
    public void onRequestPermissionsResult(
            int requestCode, @NonNull String[]permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1000) {
            // 使用が許可された
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.d("debug", "checkSelfPermission true");

                locationStart();

            } else {
                // 拒否対応
                Toast toast = Toast.makeText(this,
                        "Error", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }

    @Override
    public void onLocationChanged(Location location) {
        // 緯度の表示
        TextView textView1 = (TextView) findViewById(R.id.text_view1);
        str1 = ""+location.getLatitude();
        textView1.setText(str1);

        // 経度の表示
        TextView textView2 = (TextView) findViewById(R.id.text_view2);
        str2 = ""+location.getLongitude();
        textView2.setText(str2);
    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

}