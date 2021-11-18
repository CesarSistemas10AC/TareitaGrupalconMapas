package com.example.tareitagrupalconmapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tareitagrupalconmapas.databinding.ActivityMapsGoModernasBinding;

public class MapsActivityGoModernas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsGoModernasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsGoModernasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        LatLng cristorey = new LatLng(-22.9519173, -43.210495);
        mMap.addMarker(new MarkerOptions().position(cristorey).title("Marcado en Cristo Redentor").snippet("Ubicada en Rio de Janeiro - Brasil").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng machupicchu = new LatLng(-13.2088887, -72.4751226);
        mMap.addMarker(new MarkerOptions().position(machupicchu).title("Marcado en la ciudadela de MachuPicchu").snippet("Ubicada en Cusco - Perú").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng tajmahal = new LatLng(27.1750123, 78.0420968);
        mMap.addMarker(new MarkerOptions().position(tajmahal).title("Marcado en el Taj Mahal").snippet("Ubicada en Dharmapuri - India").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng muralla = new LatLng(40.3154808, 116.626028);
        mMap.addMarker(new MarkerOptions().position(muralla).title("Marcado en la Muralla China").snippet("Ubicada en Huairou - China").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng chichen = new LatLng(20.6828519, -88.5687196);
        mMap.addMarker(new MarkerOptions().position(chichen).title("Marcado en la Pirámide Chichen Itza").snippet("Ubicada en Yucatán - México").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng coliseo = new LatLng(41.8933203, 12.4829321);
        mMap.addMarker(new MarkerOptions().position(coliseo).title("Marcado en el Coliseo Romano").snippet("Ubicada en Roma - Italia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng petra = new LatLng(31.1667049, 36.941628);
        mMap.addMarker(new MarkerOptions().position(petra).title("Marcado en la ciudad de Petra").snippet("Ubicada en Jordania").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        Toast.makeText(this, "Le presentamos als distintas ubicaciones de las maravillas del mundo moderno y sus direcciones para poder visitarlas", Toast.LENGTH_SHORT).show();
    }
}