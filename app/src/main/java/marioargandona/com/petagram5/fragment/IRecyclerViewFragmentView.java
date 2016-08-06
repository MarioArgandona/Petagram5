package marioargandona.com.petagram5.fragment;

import java.util.ArrayList;

import marioargandona.com.petagram5.adapter.MascotaAdapter;
import marioargandona.com.petagram5.entidades.Mascota;

/**
 * Created by Robert on 8/4/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public MascotaAdapter crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotaAdapter adaptador);

}
