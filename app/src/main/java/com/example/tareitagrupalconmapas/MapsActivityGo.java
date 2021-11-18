package com.example.tareitagrupalconmapas;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tareitagrupalconmapas.databinding.ActivityMapsGoBinding;

public class MapsActivityGo extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsGoBinding binding;
    private Marker markerPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsGoBinding.inflate(getLayoutInflater());
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

        // Agregar un recurso o icono diferente del marcador
        LatLng machupicchu = new LatLng(-13.2088887, -72.4751226);
        mMap.addMarker(new MarkerOptions().position(machupicchu).title("Marcado en MachuPicchu").snippet("Una de las maravillas modernas del mundo").icon(BitmapDescriptorFactory.fromResource(R.drawable.cuscomachupicchu)));

        // Agregar un recurso o icono diferente del marcador
        LatLng pisaq = new LatLng(-13.4082849, -71.8430523);
        mMap.addMarker(new MarkerOptions().position(pisaq).title("Marcado en Pisaq").snippet("Pisaq es el lugar con más artesanía en el Cusco").icon(BitmapDescriptorFactory.fromResource(R.drawable.cuscoartesania)));

        // Agregar un recurso o icono diferente del marcador
        LatLng cusco = new LatLng(-13.5170887, -71.9785356);
        mMap.addMarker(new MarkerOptions().position(cusco).title("Marcado en Cusco").snippet("La ciudad del Cusco").icon(BitmapDescriptorFactory.fromResource(R.drawable.cuscocatedral)));

        // Agregar un recurso o icono diferente del marcador
        LatLng moray = new LatLng(-13.3298634, -72.1958153);
        mMap.addMarker(new MarkerOptions().position(moray).title("Marcado en Moray").snippet("La Arqueologia de Moray").icon(BitmapDescriptorFactory.fromResource(R.drawable.cuscomoray)));

        // Agregar un recurso o icono diferente del marcador
        LatLng saqsaywaman= new LatLng(-13.5067266, -71.9802925);
        mMap.addMarker(new MarkerOptions().position(saqsaywaman).title("Marcado en Saqsaywaman").snippet("La Arqueologia de Saqsaywaman").icon(BitmapDescriptorFactory.fromResource(R.drawable.cuscosaqsaywaman)));

        //camara zoom
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cusco,7));
        Toast.makeText(this, "Esta observando el ombligo del mundial a nivel histórico y la región propia de los incas con gran reseña histórica de todos los tiempos", Toast.LENGTH_SHORT).show();

    }

}