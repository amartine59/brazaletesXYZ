package amartine59.manillasxyz;

import android.content.res.Resources;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    private EditText Cant;
    private TextView totalPagar;
    private Resources recursos;
    private Spinner material,dije,tipo,moneda;
    private String mOpciones[],dOpciones[],tOpciones[],mnOpciones[];
    private Button btPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cant = findViewById(R.id.txtCantidad);
        totalPagar = findViewById(R.id.lblTotalPagar);
        recursos = this.getResources();
        material = findViewById(R.id.cmbMaterial);
        dije= findViewById(R.id.cmbDije);
        tipo= findViewById(R.id.cmbTipo);
        moneda= findViewById(R.id.cmbMoneda);
        mOpciones=recursos.getStringArray(R.array.materialOP);
        ArrayAdapter<String> adpMaterial = new ArrayAdapter(this,android.R.layout.simple_spinner_item,mOpciones);
        material.setAdapter(adpMaterial);
        dOpciones=recursos.getStringArray(R.array.dijeOP);
        ArrayAdapter<String> adpDije = new ArrayAdapter(this,android.R.layout.simple_spinner_item,dOpciones);
        dije.setAdapter(adpDije);
        tOpciones=recursos.getStringArray(R.array.tipOP);
        ArrayAdapter<String>adpTipo = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tOpciones);
        tipo.setAdapter(adpTipo);
        mnOpciones=recursos.getStringArray(R.array.monedaOP);
        ArrayAdapter<String> adpMoneda = new ArrayAdapter(this,android.R.layout.simple_spinner_item,mnOpciones);
        moneda.setAdapter(adpMoneda);
        btPagar = findViewById(R.id.btnOrdenar);
    }

    public boolean validarCampos(){
        if (Cant.getText().toString().isEmpty()){
            Cant.requestFocus();
            Cant.setError(recursos.getString(R.string.error_vacio));
            return false;
        }
        if (Integer.parseInt(Cant.getText().toString())<1){
            Cant.requestFocus();
            Cant.setError(recursos.getString(R.string.error_negativo));
            return false;
        }
        return true;
    }

    public void pagarBrazalete(View v){
        int materialSeleccionado,dijeSeleccionado,tipoSeleccionado,monedaSeleccionada,cantidadIngresada, Precio=0;
        totalPagar.setText("");
        if (validarCampos()){
            materialSeleccionado = material.getSelectedItemPosition();
            dijeSeleccionado = dije.getSelectedItemPosition();
            tipoSeleccionado = tipo.getSelectedItemPosition();
            monedaSeleccionada = moneda.getSelectedItemPosition();
            cantidadIngresada = Integer.parseInt(Cant.getText().toString());

            Precio = Metodos.totalPagar(cantidadIngresada,materialSeleccionado,dijeSeleccionado,tipoSeleccionado,monedaSeleccionada);
            if (monedaSeleccionada==0){
                totalPagar.setText(""+Precio+" "+recursos.getString(R.string.dolares));
            }else{
                totalPagar.setText(""+Precio+" "+ recursos.getString(R.string.pesos));
            }

        }
    }
}