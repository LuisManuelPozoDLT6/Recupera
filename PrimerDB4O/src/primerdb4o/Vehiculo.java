package primerdb4o;

public class Vehiculo {

    private int serie;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private String matricula;
    private int seguro;
    private String fechaIngreso;

    public Vehiculo() {
    }

    public Vehiculo(int serie, String marca, String modelo, int año, String color, String matricula, int seguro, String fechaIngreso) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.matricula = matricula;
        this.seguro = seguro;
        this.fechaIngreso = fechaIngreso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "serie=" + serie + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", color=" + color + ", matricula=" + matricula + ", seguro=" + seguro + ", fechaIngreso=" + fechaIngreso + '}';
    }

}
