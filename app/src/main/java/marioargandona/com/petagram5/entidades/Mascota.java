package marioargandona.com.petagram5.entidades;

/**
 * Created by Robert on 7/23/2016.
 */
public class Mascota {

    private int id;
    private String nombreMascota;
    private Integer foto;
    private Integer likes;


    public Mascota(String nombreMascota , Integer foto , Integer likes)
    {
        this.nombreMascota = nombreMascota;
        this.foto = foto;
        this.likes = likes;
    }


    public Mascota(String nombreMascota , Integer foto)
    {
        this.nombreMascota = nombreMascota;
        this.foto = foto;
    }

    public Mascota() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
