/*
 */
package Entities;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author fitog
 */
public class Voto {
    private Alumno alumnoVotante;
    private HashSet<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoVotante, HashSet<Alumno> alumnosVotados) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public HashSet<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(HashSet<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.alumnoVotante);
        hash = 97 * hash + Objects.hashCode(this.alumnosVotados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voto other = (Voto) obj;
        if (!Objects.equals(this.alumnoVotante, other.alumnoVotante)) {
            return false;
        }
        return Objects.equals(this.alumnosVotados, other.alumnosVotados);
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoVotante=" + alumnoVotante + ", alumnosVotados=" + alumnosVotados + '}';
    }
    
    
}
