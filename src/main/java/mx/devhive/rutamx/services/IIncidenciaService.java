package mx.devhive.rutamx.services;

import java.util.List;

import mx.devhive.rutamx.entities.TtrIncidencia;


public interface IIncidenciaService {
	    
    //PaginatedList list(int page, IOrderBy orderBy, Map<String,Object> mapFiltroBuscar);    
    List<TtrIncidencia> list();    
    void add(TtrIncidencia ttrIncidencia);

}
