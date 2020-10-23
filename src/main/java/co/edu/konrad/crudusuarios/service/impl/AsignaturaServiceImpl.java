package co.edu.konrad.crudusuarios.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import co.edu.konrad.crudusuarios.commons.GenericServiceImpl;
import co.edu.konrad.crudusuarios.model.Asignatura;
import co.edu.konrad.crudusuarios.repository.AsignaturaRespository;
import co.edu.konrad.crudusuarios.service.api.AsignaturaServiceAPI;


@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura,Long> implements AsignaturaServiceAPI{
	
	@Autowired
	private AsignaturaRespository AsignaturaDaoAPI;
	
	@Override
	public CrudRepository<Asignatura, Long> getDao() {
		// TODO Auto-generated method stub
		return AsignaturaDaoAPI;
	}
}
