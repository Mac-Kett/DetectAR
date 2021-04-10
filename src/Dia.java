import java.util.ArrayList;

public class Dia {

    private String fecha;
    private boolean dia_habil;
    public static final int CANT_TURNOS = 50;
    private ArrayList<Persona> inscriptos;

    public Dia(String f, boolean dh){
        setFecha(f);
        setDia_habil(dh);
        this.inscriptos = new ArrayList<Persona>();
    }

    public String getFecha() {
        return fecha;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isDia_habil() {
        return dia_habil;
    }

    private void setDia_habil(boolean dia_habil) {
        this.dia_habil = dia_habil;
    }

    public int mostrarPrioritarios(){
        //Va a contar la cantidad de prioritarios en el dia

        int contador = 0;

        for(Persona p: this.inscriptos){
            if(p.tienePrioridad() == 1){
                contador++;
            }
        }
        return contador;
    }

    public double promedioEdadPersonaSinOS(){

        double total = 0;
        int contador = 0;
        int edades = 0;

        for (Persona p: this.inscriptos){
            if(p.getPrestador() == null){
                edades += p.getEdad();
                contador++;
            }
        }

        total = edades / contador;

        return total;
    }
}
