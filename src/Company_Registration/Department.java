package Company_Registration;

import java.util.ArrayList;

/**
 * Created by okten29 on 11/26/18.
 */
public class Department implements Comparable<Department>{

    String name;
    ArrayList<Worker> workers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public int compareTo(Department o) {
        return this.getName().compareTo(o.getName());
    }

}
