package liga;

public class Equipos {

    private static final long serialVersionUID = 1L;
    private String Codigo;
    private String Nombre;
    private String Estadio;
    private Integer Aforo;
    private String Fundacion;
    private String Ciudad;
    private String Presidente;

    public Equipos() {
        super();
    }

    public Equipos(String codigo, String nombre, String estadio, Integer aforo, String fundacion, String ciudad,
            String presidente) {
        super();
        Codigo = codigo;
        Nombre = nombre;
        Estadio = estadio;
        Aforo = aforo;
        Fundacion = fundacion;
        Ciudad = ciudad;
        Presidente = presidente;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String estadio) {
        Estadio = estadio;
    }

    public Integer getAforo() {
        return Aforo;
    }

    public void setAforo(Integer aforo) {
        Aforo = aforo;
    }

    public String getFundacion() {
        return Fundacion;
    }

    public void setFundacion(String fundacion) {
        Fundacion = fundacion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String presidente) {
        Presidente = presidente;
    }

    
    
    

}