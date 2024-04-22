import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Collection;

@ManagedBean
@RequestScoped
public class Loans {
    private String entityName;
    private Collection<String> available=new ArrayList<>();
    private String selected;

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Collection<String> getAvailable() {
        return available;
    }

    public void setAvailable(Collection<String> available) {
        this.available = available;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    @PostConstruct
    public void loads(){
        available.add("Business Loan");
        available.add("House Loan");
        available.add("Education Loan");
        available.add("Gold Loan");
    }
}