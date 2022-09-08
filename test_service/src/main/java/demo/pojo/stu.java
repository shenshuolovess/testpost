package demo.pojo;

public class stu {
    private String domain;

    public String getDomain() {
        return domain;
    }

    public stu(String domain, String account, String password) {
        this.domain = domain;
        this.account = account;
        this.password = password;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String account;
    private String password;
}
