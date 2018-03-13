package amartine59.manillasxyz;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void dos_manillas_cuero_ancla_plata_dolares(){
        int cantidad=2,material=0,dije=1,tipo=2,moneda=0;
        int resultado = Metodos.totalPagar(cantidad,material,dije,tipo,moneda);
        assertEquals(200,resultado,0);

    }

    @Test
    public void cuatro_manillas_cuerda_martillo_niquel_pesos(){
        int cantidad=4,material=1,dije=0,tipo=3,moneda=1;
        int resultado = Metodos.totalPagar(cantidad,material,dije,tipo,moneda);
        assertEquals(640000,resultado,0);
    }

    @Test
    public void cinco_manillas_cuero_ancla_oroRosado_dolares(){
        int cantidad=5,material=0,dije=1,tipo=1,moneda=0;
        int resultado = Metodos.totalPagar(cantidad,material,dije,tipo,moneda);
        assertEquals(600,resultado,0);
    }
}
