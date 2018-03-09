package amartine59.manillasxyz;

import android.content.res.Resources;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        ArrayAdapter<String> adpMaterial = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,mOpciones);
        material.setAdapter(adpMaterial);
        dOpciones=recursos.getStringArray(R.array.dijeOP);
        tOpciones=recursos.getStringArray(R.array.tipOP);
        mnOpciones=recursos.getStringArray(R.array.monedaOP);
        btPagar = findViewById(R.id.btnOrdenar);
    }
}
