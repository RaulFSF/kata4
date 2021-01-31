package kata4.model;

public class Mail {
    private final String mail;
    
    public Mail(String mail){ this.mail = mail;}
    
    public String getDomain(){ return this.mail.substring(this.mail.indexOf("@") +1);}
    
    public static boolean isMail(String line){ return line.matches("^[A-Za-z0-9+_.-]+@(.+)$");}
}
