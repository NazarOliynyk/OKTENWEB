package Company_Registration;

import java.util.TreeSet;

/**
 * Created by okten29 on 11/26/18.
 */
public class Company {

    String name;
    TreeSet<Department> departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeSet<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(TreeSet<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
