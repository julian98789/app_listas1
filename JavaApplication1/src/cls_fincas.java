
public class cls_fincas {
    private String srt_nombre;
    private String srt_codigo;
    private String srt_direccion;
    private String srt_contacto;
    private String srt_propietario;

    public cls_fincas(String n, String c, String d, String co, String p) {

        this.srt_nombre = n;
        this.srt_codigo = c;
        this.srt_direccion = d;
        this.srt_contacto = co;
        this.srt_propietario = p;
    }
   
    public void setNombre(String nombre){
        this.srt_nombre = nombre;}

    public void setSrt_Direccion(String direccion) {
        this.srt_direccion = direccion;
    }

    public void setContacto(String contacto) {
        this.srt_contacto = contacto;
    }

    public void setPrOpietario(String prpietario) {
        this.srt_propietario = prpietario;
    }
    
    //metodos getter 

    public String getNombre() {
        return this.srt_nombre;
    }

    public String getCodigo() {
        return this.srt_codigo;
    }

    public String getDireccion() {
        return this.srt_direccion;
    }

    public String getContacto() {
        return this.srt_contacto;
    }

    public String getPropietario() {
        return this.srt_propietario;
    }
    
    
    
}
