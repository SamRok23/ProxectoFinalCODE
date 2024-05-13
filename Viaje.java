
public class Viaje {
    private int Duracion;
    private TipoDeTransporte TipoDeTransporte ;
    private int numPlazas;
    private String usuario;
    private String ciudadDestino;
    private String ciudadOrigen;



    private String fecha;

    public Viaje(int duracion, TipoDeTransporte tipoDeTransporte, int numPlazas, String usuario,String ciudadDestino, String ciudadOrigen, String fecha) {
        this.Duracion = duracion;
        this.TipoDeTransporte = tipoDeTransporte;
        this.numPlazas = numPlazas;
        this.usuario =usuario;
        this.ciudadDestino = ciudadDestino;
        this.ciudadOrigen = ciudadOrigen;
        this.fecha=fecha;


    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public TipoDeTransporte getTipoDeTransporte() {
        return TipoDeTransporte;
    }

    public void setTipoDeTransporte(TipoDeTransporte tipoDeTransporte) {
        TipoDeTransporte = tipoDeTransporte;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
