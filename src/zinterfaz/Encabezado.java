package zinterfaz;

/**
 *
 * @author davidxona
 */
public class Encabezado {
    
    public String ue;
    public String ano;
    public String mes;
    public String tipo_planilla;
    public String clase_planilla;
    public int correlativo;
    public int n_reg;
    public double total_ing;
    public double total_des;
    public double total_apo;
    public double total_rei;
    public double total_enc;
    public double otros_ing;

    public Encabezado(String ue, String ano, String mes, String tipo_planilla, String clase_planilla, int correlativo, int n_reg, double total_ing, double total_des, double total_apo, double total_rei, double total_enc, double otros_ing) {
        this.ue = ue;
        this.ano = ano;
        this.mes = mes;
        this.tipo_planilla = tipo_planilla;
        this.clase_planilla = clase_planilla;
        this.correlativo = correlativo;
        this.n_reg = n_reg;
        this.total_ing = total_ing;
        this.total_des = total_des;
        this.total_apo = total_apo;
        this.total_rei = total_rei;
        this.total_enc = total_enc;
        this.otros_ing = otros_ing;
    }
    
    
}
