package br.com.taskmanager.useful;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Messages {

    public static void Error(String msg){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "", msg));
    }

    public static void Warning(String msg){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "", msg));
    }

    public static void Info(String msg){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", msg));
    }
}
