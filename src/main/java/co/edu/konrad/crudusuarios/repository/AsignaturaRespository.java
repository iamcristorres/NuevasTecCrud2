package co.edu.konrad.crudusuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.edu.konrad.crudusuarios.model.Asignatura;

@Repository
public interface AsignaturaRespository extends CrudRepository<Asignatura,Long>{

}
