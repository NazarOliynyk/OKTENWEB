package Company_Registration;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Random;

/**
 * Created by okten29 on 11/26/18.
 */
public class Main {

    TreeSet<Company> companies = new TreeSet<>();

    public static ArrayList<Worker> addWorker
            (ArrayList<Worker> workers, String nameofWorker){

        Worker worker = new Worker();
        Random random = new Random (10);
        int qualification = random.nextInt(10);
        worker.setName(nameofWorker);
        worker.setQualification(qualification);
        return workers;
    }



    public static Department establishDepartment
            (Company company, ArrayList<Worker> workers, String name){
        boolean flag=false;
        Department department = new Department();

        for (Department department1: company.getDepartments()) {
            if(department1.getName().equals(name)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("The department "+name+" already exists!");
            return department;
        }else {
            department.setName(name);
            department.setWorkers(workers);
        }

        return department;
    }

    public static TreeSet<Company> establishCompany
            ( TreeSet<Company> companies, String name, TreeSet<Department> departments){

        boolean flag=false;
        Company company = new Company();


        for (Company company1 : companies) {
            if(company1.getName().equals(name)){
                System.out.println("The company with this name already exists");
                return companies;
            }
        }

        if(flag){
            System.out.println("The company " + name+" already exists");
            return companies;
        }else {
            company.setName(name);
            company.setDepartments(departments);
        }
        return companies;
    }



    public static void main(String[] args) {
        System.out.println("Hello world ggggggg!!!");

    }
}
