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
import com.example.tareitagrupalconmapas.databinding.ActivityMapsGoAntiguasBinding;

public class MapsActivityGoAntiguas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsGoAntiguasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsGoAntiguasBinding.inflate(getLayoutInflater());
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
        LatLng coloso = new LatLng(36.17263, 27.9194181);
        mMap.addMarker(new MarkerOptions().position(coloso).title("Marcado en el Coloso de Rodas").snippet("Ubicada en Rhodes - Grecia").icon(BitmapDescriptorFactory.fromResource(R.drawable.colosoderodas)));

        // Agregar un recurso o icono diferente del marcador
        LatLng faro = new LatLng(31.199004, 29.894378);
        mMap.addMarker(new MarkerOptions().position(faro).title("Marcado en el Faro de Alejandria").snippet("Ubicado en Alejandría - Egipto").icon(BitmapDescriptorFactory.fromResource(R.drawable.elfarodealejandria)));

        // Agregar un recurso o icono diferente del marcador
        LatLng zeus = new LatLng(37.9839412, 23.7283052);
        mMap.addMarker(new MarkerOptions().position(zeus).title("Marcado en la estatua de Zeus").snippet("Ubicada en Grecia").icon(BitmapDescriptorFactory.fromResource(R.drawable.estatuadezeus)));

        // Agregar un recurso o icono diferente del marcador
        LatLng jardines = new LatLng(36.0367935, 42.3168623);
        mMap.addMarker(new MarkerOptions().position(jardines).title("Marcado en los Jardines de Babilonia").snippet("Ubicada en Nínive").icon(BitmapDescriptorFactory.fromResource(R.drawable.jardinesdebabilonia)));

        // Agregar un recurso o icono diferente del marcador
        LatLng mausoleo = new LatLng(37.0664467, 27.4844182);
        mMap.addMarker(new MarkerOptions().position(mausoleo).title("Marcado en el Mausoleo de Halicarnaso").snippet("Ubicada en Bodrum - Turquia").icon(BitmapDescriptorFactory.fromResource(R.drawable.mausoleodehalicarnaso)));

        // Agregar un recurso o icono diferente del marcador
        LatLng templo = new LatLng(37.9479596, 27.3685349);
        mMap.addMarker(new MarkerOptions().position(templo).title("Marcado en el Templo de Artemiza").snippet("Ubicada en Selcuk - Turquia").icon(BitmapDescriptorFactory.fromResource(R.drawable.templodeartemiza)));

        // Agregar un recurso o icono diferente del marcador
        LatLng giza = new LatLng(29.9870753, 31.2118063);
        mMap.addMarker(new MarkerOptions().position(giza).title("Marcado en la Pirámide de Giza").snippet("Ubicada en Al Giza Desert - Egipto").icon(BitmapDescriptorFactory.fromResource(R.drawable.piramidedegiza)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(giza,7));
        Toast.makeText(this, "Esta observanod los lugares donde anduvieron los restos de las maravillas del mundo antigüo y que hoy en la actualidad solo la pirámide de Giza esta vigente a nuestros ojos.", Toast.LENGTH_SHORT).show();
    }
}