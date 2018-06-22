
package clases;

public class BalancePasivo {
    double proveedores;
    double acreedores;
    double acredoHip;
    double docuxPagar;
    double capSocial;
    double utilEjer;
    
    public BalancePasivo(double proveedores,double acreedores,double acredoHip,
            double docuxPagar,double capSocial,double utilEjer){
        this.proveedores = proveedores;
        this.acreedores = acreedores;
        this.acredoHip = acredoHip;
        this.docuxPagar = docuxPagar;
        this.capSocial = capSocial;
        this.utilEjer = utilEjer;
    }

    public double getProveedores() {
        return proveedores;
    }

    public void setProveedores(double proveedores) {
        this.proveedores = proveedores;
    }

    public double getAcreedores() {
        return acreedores;
    }

    public void setAcreedores(double acreedores) {
        this.acreedores = acreedores;
    }

    public double getAcredoHip() {
        return acredoHip;
    }

    public void setAcredoHip(double acredoHip) {
        this.acredoHip = acredoHip;
    }

    public double getDocuxPagar() {
        return docuxPagar;
    }

    public void setDocuxPagar(double docuxPagar) {
        this.docuxPagar = docuxPagar;
    }

    public double getCapSocial() {
        return capSocial;
    }

    public void setCapSocial(double capSocial) {
        this.capSocial = capSocial;
    }

    public double getUtilEjer() {
        return utilEjer;
    }

    public void setUtilEjer(double utilEjer) {
        this.utilEjer = utilEjer;
    }
    
    
    
}
