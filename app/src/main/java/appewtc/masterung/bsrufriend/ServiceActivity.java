package appewtc.masterung.bsrufriend;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class ServiceActivity extends FragmentActivity implements OnMapReadyCallback {

    //Explicit
    private GoogleMap mMap;
    private double userLatADouble = 13.733030, userLngADouble = 100.489416;
    private TextView textView;
    private Button button;
    private String[] loginStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        //Bind Widget
        textView = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button4);

        //Receive Value for MainActivity
        loginStrings = getIntent().getStringArrayExtra("Login");

        //Show Text
        textView.setText(loginStrings[1]);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }   //  Main Method

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Setup Center of Map
        mMap.animateCamera(CameraUpdateFactory
                .newLatLngZoom(new LatLng(userLatADouble, userLngADouble), 16));


    }   // onMapReady

}   // Main Class
