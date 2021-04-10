public class Persona implements Notificable, Priorizable {
    private String DNI;
    private String nombre;
    private String apellido;
    private int edad;
    private Motivo motivo;
    private String prestador;
    private int afiliado;

    public Persona(String dni, String n, String a, int e, Motivo m, String p, int af){
        setDNI(dni);
        setNombre(n);
        setApellido(a);
        setEdad(e);
        this.motivo = m;
        setPrestador(p);
        setAfiliado(af);
    }

    public String getDNI() {
        return DNI;
    }

    private void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPrestador() {
        return prestador;
    }

    private void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    public int getAfiliado() {
        return afiliado;
    }

    private void setAfiliado(int afiliado) {
        this.afiliado = afiliado;
    }

    @Override
    public int tienePrioridad() {

        int resultado = 2;
        if(this.prestador == null
                && this.edad >= 60
                && this.motivo == Motivo.CONTRACTO_ESTRECHO){
            resultado = 1;
        }

        return resultado;
    }

    @Override
    public void notificar(String s) {
        System.out.println(s);
    }
}
