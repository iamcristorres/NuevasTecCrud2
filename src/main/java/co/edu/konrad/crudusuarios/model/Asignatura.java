package co.edu.konrad.crudusuarios.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

/**
 * Asignatura
 */
@Entity
public class Asignatura {
    
    @Id // Llave principal
    @GeneratedValue(strategy = GenerationType.AUTO) // campo autoincremental
    private Long id;

    //Nombre
    @Column
    private String nombre;

    //Intensidad
    @Column
    private String intensidad;

    //Salon
    @Column
    private String salon;

    //Edificio
    @Column
    private String edificio;

    //Profesor
    @Column
    private String profesor;


    ///Getters and Setters
    
    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the intensidad
     */
    public String getIntensidad() {
        return intensidad;
    }

    /**
     * @param intensidad the intensidad to set
     */
    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    /**
     * @return String return the salon
     */
    public String getSalon() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setSalon(String salon) {
        this.salon = salon;
    }

    /**
     * @return String return the edificio
     */
    public String getEdificio() {
        return edificio;
    }

    /**
     * @param edificio the edificio to set
     */
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    /**
     * @return String return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

}