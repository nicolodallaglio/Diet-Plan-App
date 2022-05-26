package Model;

public class Alimenti {
    private int id;
    private String name;
    private String tipo;
    private int calorie;
    private float cho;
    private float prote;
    private float grassi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setAlcolico(String alcolico) {
        this.tipo = alcolico;
    }

    public float getCho() {
        return cho;
    }

    public void setCho(float cho) {
        this.cho = cho;
    }

    public float getProte() {
        return prote;
    }

    public void setProte(float prote) {
        this.prote = prote;
    }

    public float getGrassi() {
        return grassi;
    }

    public void setGrassi(float grassi) {
        this.grassi = grassi;
    }
}
