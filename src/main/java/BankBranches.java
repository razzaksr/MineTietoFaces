import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BankBranches {
    private String bankName;
    private String branchName;
    private String ifsCode;
    private long contact;

    @Override
    public String toString() {
        return "BankBranches{" +
                "bankName='" + bankName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", ifsCode='" + ifsCode + '\'' +
                ", contact=" + contact +
                '}';
    }

    public BankBranches() {
    }

    public BankBranches(String bankName, String branchName, String ifsCode, long contact) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.ifsCode = ifsCode;
        this.contact = contact;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfsCode() {
        return ifsCode;
    }

    public void setIfsCode(String ifsCode) {
        this.ifsCode = ifsCode;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}