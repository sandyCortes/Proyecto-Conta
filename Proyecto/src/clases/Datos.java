
package clases;

public class Datos {
    public static String nomEmpres = null, firmElavo = null,firmaA = null;
    public static float [][]matriz = new float[1][18];
    public static int mes=0, ventas=1, cosVenta=2, gasVentas=3, gasAdmon=4, gasFinan=5,
            proFinan=6, otrosP=7, ISR = 8, ptu=9, utilEjer=10, utilOpera=11, otrosG=12,Dia = 13
            ,año=14,utilBrut = 15,utilAnHimp = 16;
    public Datos(){
        matriz = null; 
    }
    
    public static void Operacion(){
        float suma =  matriz[0][ventas] - matriz[0][cosVenta];
        matriz[0][utilBrut] = suma;
        suma -= matriz[0][gasVentas];
        suma -= matriz[0][gasAdmon];
        matriz[0][utilOpera] = suma;
        suma-= matriz[0][gasFinan];
        suma-= matriz[0][otrosG];
        suma += matriz[0][proFinan];
        suma += matriz[0][otrosP];
        matriz[0][utilAnHimp] = suma;
        matriz[0][ISR] = suma * 0.30f;
        matriz[0][ptu] = suma * 0.10f;
        matriz[0][utilEjer] = (matriz[0][utilAnHimp] - matriz[0][ISR]) - matriz[0][ptu];
    }    
    
    public static int Ultim(){
     int Fecha = (int)matriz[0][mes];
     
     if(Fecha == 4 || Fecha == 6 || Fecha == 9 || Fecha == 11 )
         return 30;
     else if(Fecha == 2)
         return 28;
     else
         return 31;       
        }
    
    public static String MES(){
       int Fecha = (int)matriz[0][mes];
       String Mes="";
        switch (Fecha) {
            case 1:
                Mes =  "enero";
                break;
            case 2:
                Mes = "febrero";
                break;
            case 3:
                Mes = "Marzo";
                break;
            case 4:
                Mes = "abril";
                break;
            case 5:
                Mes = "Mayo";
                break;
            case 6: 
                Mes = "Junio";
                break;
            case 7: 
                Mes = "Julio";
                break;
            case 8: 
                Mes = "Agosto";
                break;
            case 9:
                Mes = "Septiembre";
                break;
            case 10:
                Mes = "Octubre";
                break;
            case 11:
                Mes = "Noviembre";
                break;
            case 12:
                Mes = "Diciembre";
                break;
            default:
                break;
        }
        
        return Mes;
        }
    } 


