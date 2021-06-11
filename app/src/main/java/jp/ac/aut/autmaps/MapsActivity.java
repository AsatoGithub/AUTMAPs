package jp.ac.aut.autmaps;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



        //Intentで画面遷移をした際に送られた値を受け取る
        Intent intent=getIntent();
        //受け取った値を変数keyに代入、値がなければ-1を格納
        int key = intent.getIntExtra("key",-1);
        //keyの値でどの経路案内を行うか決める
        if(key == 1){
            test1();
        }else if(key == 2){
            test2();
        }else{
            test3();
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // 愛知工科大学正門にカメラ移動
        LatLng AUT = new LatLng(34.83199544311324, 137.19221521910694);
        mMap.addMarker(new MarkerOptions().position(AUT).title("愛知工科大学"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AUT));

        //GoogleMapの座標位置の変更
        CameraUpdate cUpdate = CameraUpdateFactory.newLatLngZoom(
                new LatLng(34.83199544311324, 137.19221521910694), 18);
        mMap.moveCamera(cUpdate);
    }

    // 4号館緯度経度を入れて経路を検索
    private void test1(){

        // 起点の緯度経度
        String src_lat = "34.83199544311324";
        String src_ltg = "137.19221521910694";

        // 目的地の緯度経度
        String des_lat = "34.83271214801132";
        String des_ltg = "137.19337738958157";

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);

        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");

        // 起点の緯度,経度, 目的地の緯度,経度
        String str = String.format(Locale.US,
                "http://maps.google.com/maps?saddr=%s,%s&daddr=%s,%s",
                src_lat, src_ltg, des_lat, des_ltg);

        intent.setData(Uri.parse(str));
        startActivity(intent);
    }


    // 4号館緯度経度を入れて経路を検索
    private void test2(){
        // 起点の緯度経度
        String src_lat = "34.83199544311324";
        String src_ltg = "137.19221521910694";

        // 目的地の緯度経度
        String des_lat = "34.832661960529535";
        String des_ltg = "137.19279216525027";

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);

        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");

        // 起点の緯度,経度, 目的地の緯度,経度
        String str = String.format(Locale.US,
                "http://maps.google.com/maps?saddr=%s,%s&daddr=%s,%s",
                src_lat, src_ltg, des_lat, des_ltg);

        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    // 6号館緯度経度を入れて経路を検索
    private void test3(){

        // 起点の緯度経度
        String src_lat = "34.83199544311324";
        String src_ltg = "137.19221521910694";

        // 目的地の緯度経度
        String des_lat = "34.83247315972881";
        String des_ltg = "137.19314446447456";

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);

        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");

        // 起点の緯度,経度, 目的地の緯度,経度
        String str = String.format(Locale.US,
                "http://maps.google.com/maps?saddr=%s,%s&daddr=%s,%s",
                src_lat, src_ltg, des_lat, des_ltg);

        intent.setData(Uri.parse(str));
        startActivity(intent);
    }
}