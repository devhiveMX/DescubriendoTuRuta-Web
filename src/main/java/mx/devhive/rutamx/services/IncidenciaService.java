package mx.devhive.rutamx.services;

import java.util.List;
import mx.devhive.rutamx.entities.TtrIncidencia;
import mx.devhive.rutamx.repositories.IncidenciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IncidenciaService implements IIncidenciaService {
	
    @Autowired
    private IncidenciaRepository incidenciaRepository;

    public List<TtrIncidencia> list(){        
        return incidenciaRepository.findAll();
    }

    public void add(TtrIncidencia ttrIncidencia){
    	    	
    	if(incidenciaRepository.countByIncidenciaId(ttrIncidencia.getIncidenciaId()) == 0){
	    	
	    	incidenciaRepository.save(ttrIncidencia);
    	}
    }
}
