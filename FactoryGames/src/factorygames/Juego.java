
package factorygames;


public class Juego {
    
    private String nombre_juego;
    private String plataforma_juego;
    private int precio_juego;
    private boolean estado_juego;

    public Juego() {
    }

    public Juego(String nombre_juego, String plataforma_juego, int precio_juego, boolean estado_juego) {
        this.nombre_juego = nombre_juego;
        this.plataforma_juego = plataforma_juego;
        this.precio_juego = precio_juego;
        this.estado_juego = estado_juego;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public String getPlataforma_juego() {
        return plataforma_juego;
    }

    public void setPlataforma_juego(String plataforma_juego) {
        this.plataforma_juego = plataforma_juego;
    }

    public int getPrecio_juego() {
        return precio_juego;
    }

    public void setPrecio_juego(int precio_juego) {
        this.precio_juego = precio_juego;
    }

    public boolean isEstado_juego() {
        return estado_juego;
    }

    public void setEstado_juego(boolean estado_civil) {
        this.estado_juego = estado_civil;
    }
    
      
}
