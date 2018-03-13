package amartine59.manillasxyz;

/**
 * Created by amartine59 on 13/03/2018.
 */

public class Metodos {

    public static int totalPagar(int cant,int opcMaterial,int opcDije,int opcTipo,int opcMoneda){
       int precio = 0;
        switch (opcMaterial){
            case 0: //Cuero
                switch (opcDije){
                    case 0://Cuero - Martillo
                        switch (opcTipo){
                            case 0:// Cuero - Martillo - Oro
                                switch (opcMoneda){
                                    case 0://Cuero - Martillo - Oro - Dolares
                                        precio = cant*100;
                                        break;
                                    case 1://Cuero - Martillo - Oro - Pesos
                                        precio = cant*(100*3200);
                                        break;
                                }
                            break;
                            case 1://Cuero-Martillo-OroRosado
                                switch (opcMoneda){
                                    case 0://Cuero-Martillo-OroRosado-Dolares
                                        precio = cant*100;
                                        break;
                                    case 1://Cuero-Martillo-OroRosado-Pesos
                                        precio = cant*(100*3200);
                                        break;

                                }
                            break;
                            case 2://Cuero - Martillo - Plata
                                switch (opcMoneda){
                                    case 0://Cuero - Martillo - Plata- Dolares
                                        precio= cant*80;
                                        break;
                                    case 1://Cuero - Martillo - Plata-Pesos
                                        precio = cant*(80*3200);
                                        break;
                                }
                            break;
                            case 3://Cuero - Martillo - Niquel
                                switch (opcMoneda){
                                    case 0://Cuero - Martillo - Niquel -Dolares
                                        precio = cant*70;
                                        break;
                                    case 1://Cuero - Martillo - Niquel -Pesos
                                        precio = cant*(70*3200);
                                        break;
                                }
                                break;

                        }
                    break;
                    case 1://Cuero-Ancla
                        switch (opcTipo){
                            case 0://Cuero-Ancla-Oro
                                switch (opcMoneda){
                                    case 0://Cuero-Ancla-Oro-Dolares
                                        precio= cant*120;
                                        break;
                                    case 1://Cuero-Ancla-Oro-Pesos
                                        precio = cant*(120*3200);
                                        break;
                                }
                            break;
                            case 1://Cuero-Ancla-OroRosado
                                switch (opcMoneda){
                                    case 0://Cuero-Ancla-OroRosado-Dolares
                                        precio=  cant*120;
                                        break;
                                    case 1://Cuero-Ancla-OroRosado-Pesos
                                        precio= cant*(120*3200);
                                        break;
                                }
                            break;
                            case 2://Cuero-Ancla-Plata
                                switch (opcMoneda){
                                    case 0://Cuero-Ancla-Plata-Dolares
                                        precio=cant*100;
                                        break;
                                    case 1://Cuero-Ancla-Plata-Pesos
                                        precio=cant*(100*3200);
                                        break;
                                }
                            break;
                            case 3://Cuero-Ancla-Niquel
                                 switch (opcMoneda){
                                     case 0://Cuero-Ancla-Niquel-Dolares
                                         precio = cant*90;
                                         break;
                                     case 1://Cuero-Ancla-Niquel-Pesos
                                         precio = cant*(90*3200);
                                         break;
                                 }
                            break;
                        }
                    break;

                }
            break;
            case 1://Cuerda
                switch (opcDije){
                    case 0://Cuerda - Martillo
                        switch (opcTipo){
                            case 0:// Cuerda - Martillo - Oro
                                switch (opcMoneda){
                                    case 0://Cuerda - Martillo - Oro - Dolares
                                        precio = cant*90;
                                        break;
                                    case 1://Cuerda - Martillo - Oro - Pesos
                                        precio = cant*(90*3200);
                                        break;
                                }
                                break;
                            case 1://Cuerda-Martillo-OroRosado
                                switch (opcMoneda){
                                    case 0://Cuerda-Martillo-OroRosado-Dolares
                                        precio = cant*90;
                                        break;
                                    case 1://Cuerda-Martillo-OroRosado-Pesos
                                        precio = cant*(90*3200);
                                        break;

                                }
                                break;
                            case 2://Cuerda - Martillo - Plata
                                switch (opcMoneda){
                                    case 0://Cuerda - Martillo - Plata- Dolares
                                        precio= cant*70;
                                        break;
                                    case 1://Cuerda - Martillo - Plata-Pesos
                                        precio = cant*(70*3200);
                                        break;
                                }
                                break;
                            case 3://Cuerda - Martillo - Niquel
                                switch (opcMoneda){
                                    case 0://Cuerda - Martillo - Niquel -Dolares
                                        precio = cant*50;
                                        break;
                                    case 1://Cuerda - Martillo - Niquel -Pesos
                                        precio = cant*(50*3200);
                                        break;
                                }
                                break;

                        }
                        break;
                    case 1://Cuerda-Ancla
                        switch (opcTipo){
                            case 0://Cuerda-Ancla-Oro
                                switch (opcMoneda){
                                    case 0://Cuerda-Ancla-Oro-Dolares
                                        precio= cant*110;
                                        break;
                                    case 1://Cuerda-Ancla-Oro-Pesos
                                        precio = cant*(110*3200);
                                        break;
                                }
                                break;
                            case 1://Cuerda-Ancla-OroRosado
                                switch (opcMoneda){
                                    case 0://Cuerda-Ancla-OroRosado-Dolares
                                        precio=  cant*110;
                                        break;
                                    case 1://Cuerda-Ancla-OroRosado-Pesos
                                        precio= cant*(110*3200);
                                        break;
                                }
                                break;
                            case 2://Cuerda-Ancla-Plata
                                switch (opcMoneda){
                                    case 0://Cuerda-Ancla-Plata-Dolares
                                        precio=cant*90;
                                        break;
                                    case 1://Cuerda-Ancla-Plata-Pesos
                                        precio=cant*(90*3200);
                                        break;
                                }
                            break;
                            case 3://Cuerda-Ancla-Niquel
                             switch (opcMoneda){
                                 case 0://Cuerda-Ancla-Niquel-Dolares
                                     precio=cant*80;
                                     break;
                                 case 1://Cuerda-Ancla-Niquel-Pesos
                                     precio = cant*(80*3200);
                                     break;
                             }
                            break;
                        }
                        break;

                }

        }
        return precio;
    }
}
