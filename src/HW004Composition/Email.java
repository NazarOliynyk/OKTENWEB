package HW004Composition;

/**
 * Created by user on 19.11.18.
 */
public class Email implements Comparable<Email>{

    private String site;
    private String login;
    private String pasword;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (site != null ? !site.equals(email.site) : email.site != null) return false;
        if (login != null ? !login.equals(email.login) : email.login != null) return false;
        return pasword != null ? pasword.equals(email.pasword) : email.pasword == null;

    }

    @Override
    public int hashCode() {
        int result = site != null ? site.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (pasword != null ? pasword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "site='" + site + '\'' +
                ", login='" + login + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }

    @Override
    public int compareTo(Email o) {
        return this.getLogin().compareTo(o.getLogin());
    }

    public void logination(String login, String pasword){
        if(this.getLogin().equals(login)&&this.getPasword().equals(pasword)){
            System.out.println("Access allowed");
        }else {
            System.out.println("Access denied!!");
        }
    }
}
