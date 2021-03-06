package marioargandona.com.petagram5.fragment;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import marioargandona.com.petagram5.R;
import marioargandona.com.petagram5.adapter.MiMascotaAdapter;
import marioargandona.com.petagram5.entidades.Mascota;


public class PrincipalFragment extends Fragment {

    public ArrayList<Mascota> mascotas;
    public RecyclerView listaMascotas;
    public ImageView imvMiMascota;
    public MiMascotaAdapter adapter;

    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_principal , container , false);

        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMiMascota);
        //imvMiMascota = (ImageView)v.findViewById(R.id.imvPrincipal);


        //extraemos el drawable en un bitmap
        Drawable originalDrawable = getResources().getDrawable(R.drawable.perroprincipal);
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        //creamos el drawable redondeado
        RoundedBitmapDrawable roundedDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);

        //asignamos el CornerRadius
        roundedDrawable.setCornerRadius(originalBitmap.getHeight());

        ImageView imageView = (ImageView)v.findViewById(R.id.imvPrincipal);
        imageView.setImageDrawable(roundedDrawable);

        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);


        listaMascotas.setLayoutManager(glm);

        iniciaListaMascotas();
        iniciaAdapterMascotas();

        return v;
    }



    private void iniciaListaMascotas()
    {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Spark"    ,  R.drawable.perro1 , 2));
        mascotas.add(new Mascota("Coffee"   ,  R.drawable.perro2 , 15));
        mascotas.add(new Mascota("Kaiser"   ,  R.drawable.perro3 , 12));
        mascotas.add(new Mascota("Shamuu"   ,  R.drawable.perro4 , 6));
        mascotas.add(new Mascota("Bingo"    ,  R.drawable.perro5 , 9));
        //mascotas.add(new Mascota("Pogo"     , R.drawable.perro6));
    }



    private void iniciaAdapterMascotas()
    {
        adapter = new MiMascotaAdapter(mascotas,getActivity());
        listaMascotas.setAdapter(adapter);
    }
}
