package mx.com.meda;

import java.io.Serializable;

import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.NoneScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.AbortProcessingException;

@ManagedBean
@NoneScoped
public class CargasMedaBean implements Serializable {

	private Logger log = Logger.getLogger(this.getClass());

	private static final class CargasActionListener implements ActionListener {
		public void processAction(ActionEvent event) throws AbortProcessingException {
			addFacesMessage("Se invoco al metodo.");
		}
	}

	private String cargador = "Ninguno";
	private ActionListener actionListener = new CargasActionListener();

	public static void addFacesMessage(String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(mensaje));
	}

	public String getCargador() {
		return this.cargador;
	}

	public void setCargador(String crg) {
		this.cargador = crg;
	}

	public void invocarHitssAcreditaciones(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.HITSS_ACREDITACIONES;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarHitssAltas(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.HITSS;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarChedrauiEntrada(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.CHEDRAUI;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarChedrauiSalida(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.CHEDRAUI;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarSalida();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarIaveEntrada(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.IAVE;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarInbursaEntrada(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.INBURSA;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarOstarEntrada(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.OSTAR;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarSanbornsEntrada(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.SANBORNS;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarSanbornsSalida(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.SANBORNS;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarSalida();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}

	public void invocarHidrosinaEntrada(ActionEvent evt) throws AbortProcessingException {
		Socio socio = Socio.HIDROSINA;
		Processor proc = ProcessorFactory.getProcessorInstance(socio);
		proc.procesarEntrada();
		addFacesMessage("Se invocó el proceso para: "+socio.getNombre()+" con id de socio: "+socio.getId());
		proc.release();
	}


	public ActionListener getActionListener() {
		return actionListener;
	}

}