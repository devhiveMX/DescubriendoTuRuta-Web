package mx.devhive.rutamx.rest.resource;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import mx.devhive.rutamx.entities.TtrIncidencia;
import mx.devhive.rutamx.rest.utils.Consts;
import mx.devhive.rutamx.services.IIncidenciaService;

import org.apache.commons.io.IOUtils;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


@Path("/incidencias")
public class IncidenciaRestService implements IIncidenciaService{
	
	@EJB
	private IIncidenciaService iIncidenciaService;
	
//	@GET
//	@Path("/getIncidenciaNumber")
//	@Override
//	public Integer getIncidenciaNumber() {
//		return iIncidenciaService.getAccountNumber();
//	}

	@GET
	@Path("/getIncidenciaList")
	@Produces("application/json")
	@Override
	public List<TtrIncidencia> list() {
		return iIncidenciaService.list();
	}
	
//	@GET 
//	@Path("{id}")
//	@Produces("application/json")
//	public TtrIncidencia getAccount(@PathParam("id") String id) {				
//		return iIncidenciaService.getIncidencia(id);						
//	}
	
//	@GET 
//	@Path("/findbyname/{name}")
//	@Produces("application/json")
//	public List<TtrIncidencia> findByName(@PathParam("name") String name) {			
//		return iIncidenciaService.findByName(name);						
//	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void add(TtrIncidencia ttrIncidencia) {
		iIncidenciaService.add(ttrIncidencia);
	}
	
//	@PUT 
//	@Path("{id}")
//	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public TtrIncidencia update(TtrIncidencia ttrIncidencia) {
//		iIncidenciaService.update(ttrIncidencia);
//		return ttrIncidencia;
//	}
	
//	@DELETE 
//	@Path("{id}")
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public void delete(@PathParam("id") int id) {		
//		iIncidenciaService.delete(id);
//	}
	
	@GET
	@Path("/picture/{picturename}")
	@Produces("image/png")	
	public Response getFile(@PathParam("picturename") String pictureName) {
		
		String fileName = Consts.BASE_PATH_FILE + File.separator + pictureName;
		
	    File file = new File(fileName);

	    ResponseBuilder response = Response.ok((Object) file);
	    response.header("Content-Disposition", "attachment; filename=image_from_server.png");
	    return response.build();

	}
	
	@POST
	@Path("/upload/{filename}")	
	@Consumes("multipart/form-data")
	public Response uploadFile(	@PathParam("filename") String filename, MultipartFormDataInput input) {
		String file = "";
		Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
		List<InputPart> inputParts = uploadForm.get("file");
		for (InputPart inputPart : inputParts) {
		 try {
			MultivaluedMap<String, String> header = inputPart.getHeaders();
			InputStream inputStream = inputPart.getBody(InputStream.class,null);
			byte [] bytes = IOUtils.toByteArray(inputStream);
			file = Consts.BASE_PATH_FILE + File.separator + filename;
			writeFile(bytes,file);
  
		  } catch (IOException e) {
			e.printStackTrace();
		  }
 
		} 
		return Response.status(200).entity("uploadFile is called, Uploaded file name : " + file).build(); 
	}
		
	/**
	 * header sample
	 * {
	 * 	Content-Type=[image/png], 
	 * 	Content-Disposition=[form-data; name="file"; filename="filename.extension"]
	 * }
	 **/
	private String getFileName(MultivaluedMap<String, String> header) { 
		String[] contentDisposition = header.getFirst("Content-Disposition").split(";");
		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {
				String[] name = filename.split("=");
				String finalFileName = name[1].trim().replaceAll("\"", "");
				return finalFileName;
			}
		}
		return "unknown";
	}
	

	private void writeFile(byte[] content, String filename) throws IOException { 
		File file = new File(filename);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fop = new FileOutputStream(file);
		fop.write(content);
		fop.flush();
		fop.close();
	}
	
}