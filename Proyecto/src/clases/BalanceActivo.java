
package clases;

public class BalanceActivo {
    double bancos;
    double clientes;
    double Deudores;
    double almacen;
    double Terreno;
    double edificio;
    double maqEqui;
    double mobiEquipo;
    double eqComp;
    double eqTrans;
    double gasOrga;
    double gasInsta;
    double segPag;
    
    public BalanceActivo(double bancos,double clientes,double Deudores,
            double almacen,double Terreno,double edificio,double maqEqui,double mobiEquipo,
            double eqComp,double eqTrans,double gasOrga,double gasInsta,double segPag){
        this.bancos = bancos;
        this.clientes = clientes;
        this.Deudores = Deudores;
        this.almacen = almacen;
        this.Terreno = Terreno;
        this.edificio = edificio;
        this.maqEqui = maqEqui;
        this.mobiEquipo = maqEqui;
        this.eqComp = maqEqui;
        this.eqTrans = eqTrans;
        this.gasOrga = gasOrga;
        this.gasInsta = gasInsta;
        this.segPag = segPag;
    }

    public double getBancos() {
        return bancos;
    }

    public void setBancos(double bancos) {
        this.bancos = bancos;
    }

    public double getClientes() {
        return clientes;
    }

    public void setClientes(double clientes) {
        this.clientes = clientes;
    }

    public double getDeudores() {
        return Deudores;
    }

    public void setDeudores(double Deudores) {
        this.Deudores = Deudores;
    }

    public double getAlmacen() {
        return almacen;
    }

    public void setAlmacen(double almacen) {
        this.almacen = almacen;
    }

    public double getTerreno() {
        return Terreno;
    }

    public void setTerreno(double Terreno) {
        this.Terreno = Terreno;
    }

    public double getEdificio() {
        return edificio;
    }

    public void setEdificio(double edificio) {
        this.edificio = edificio;
    }

    public double getMaqEqui() {
        return maqEqui;
    }

    public void setMaqEqui(double maqEqui) {
        this.maqEqui = maqEqui;
    }

    public double getMobiEquipo() {
        return mobiEquipo;
    }

    public void setMobiEquipo(double mobiEquipo) {
        this.mobiEquipo = mobiEquipo;
    }

    public double getEqComp() {
        return eqComp;
    }

    public void setEqComp(double eqComp) {
        this.eqComp = eqComp;
    }

    public double getEqTrans() {
        return eqTrans;
    }

    public void setEqTrans(double eqTrans) {
        this.eqTrans = eqTrans;
    }

    public double getGasOrga() {
        return gasOrga;
    }

    public void setGasOrga(double gasOrga) {
        this.gasOrga = gasOrga;
    }

    public double getGasInsta() {
        return gasInsta;
    }

    public void setGasInsta(double gasInsta) {
        this.gasInsta = gasInsta;
    }

    public double getSegPag() {
        return segPag;
    }

    public void setSegPag(double segPag) {
        this.segPag = segPag;
    }
    
    public double SumaCirculante(){
        double suma;
        suma = bancos+clientes+Deudores+almacen;
        return suma;
    }
    
    public double SumaNCir(){
        double s;
        s = Terreno+edificio+maqEqui+mobiEquipo+eqComp+eqTrans+
                gasOrga+gasInsta+segPag;
        return s;
    }
    
    public double SumaTotalAct(){
        return SumaCirculante()+SumaNCir();
    }
}
