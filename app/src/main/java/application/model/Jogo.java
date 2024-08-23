package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jogos")
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = true)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
        name = "jogos_possuem_plataformas",
        joinsColumns = @JoinColumn(name = "id_jogos"),
        inverseJoinColumns = @JoinColumn(name = "id_plataformas"))
    private Set<Plataforma> plataformas = new HashSet<>();

    public long geiId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Set<Plataforma> getPlataformas() {
        return plataformas;
    }
    
    public void setPlataformas(Set<Plataforma> Plataformas) {
        this.Plataformas = plataformas;
    }
}