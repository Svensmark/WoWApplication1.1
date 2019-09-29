package exceptions;


public class ExceptionDTO {
    
    private int statuscode;
    private String errormessage;

    public ExceptionDTO(int statuscode, String errormessage) {
        this.statuscode = statuscode;
        this.errormessage = errormessage;
    }

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }
    
}
