package dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import antonio.ejemplos.alertdialogs.SegundaVentana;

/**
 * Created by Susana on 04/08/2015.
 */
public class DialogosAlertas extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder alerta=new AlertDialog.Builder(getActivity());//Para que pueda ser llamado desde cualquier ventan
        alerta.setMessage("Desea realizar la operaci?");

        //Si responde que si:
        alerta.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(getActivity().getApplicationContext(), SegundaVentana.class);
                startActivity(in);



            }
        });

        //Si responde que no;
        alerta.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getActivity().finish();//Cerramos la ventana...


            }
        });





        return alerta.create();




    }
}
