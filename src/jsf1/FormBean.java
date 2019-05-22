package jsf1;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name ="formBean")
@SessionScoped
public class FormBean {	
	private String isim,soyisim,medeni,adres;
	private List<String> cinsiyet = new ArrayList<String>();
	private String parametre1;
	
	public FormBean() {
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getMedeni() {
		return medeni;
	}

	public void setMedeni(String medeni) {
		this.medeni = medeni;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public List<String> getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(List<String> cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	

	public String getParametre1() {
		return parametre1;
	}

	public void setParametre1(String parametre1) {
		this.parametre1 = parametre1;
	}

	public String yonlendir(){
		return "goster?faces-redirect = true";
	}
	
	public void passWithMethod(String param) {
		parametre1 = param.toString();
	}
	
	public void passWithFparam1() {
		parametre1 = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("param2");
	}
}
