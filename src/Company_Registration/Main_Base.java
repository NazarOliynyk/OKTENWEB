package Company_Registration;

import JobAdds.*;

import java.util.*;
import java.util.Random;
/**
 * Created by okten29 on 11/26/18.
 */
public class Main_Base {

    static TreeSet<Company> companies = new TreeSet<>();
    static Reader r = new Reader();

    public static TreeSet<Company> addCompany(String name){

        boolean flag=false;
        Company company = new Company();
        TreeSet<Department> departments = new TreeSet<>();

        for (Company company1 : companies) {
            if(company1.getName().equals(name)){
                flag=true;
            }
        }

        if(flag){
            System.out.println("The company " + name+" already exists!");
            return companies;
        }else {
            company.setName(name);
            company.setDepartments(departments);
            companies.add(company);
        }
        return companies;
    }
    public static TreeSet<Company> removeCompany(String name){

        boolean flag=false;
        Company company = new Company();

        Iterator<Company> iterator = companies.iterator();
        while (iterator.hasNext()){
            Company next = iterator.next();
            if(next.getName().equals(name)){
                iterator.remove();
                flag=true;
                return companies;
            }
        }

        if(!flag){
            System.out.println("The company " + name+" does not exist!");
            r.reply("The company " + name+" does not exist!");
            return companies;
        }
        return companies;
    }

    public static Company selectCompany(String name){

        boolean flag=false;
        Company company = new Company();
        for (Company company1 : companies) {
            if(company1.getName().equals(name)){
                flag=true;
                company=company1;
                return company;
            }
        }
        if(!flag){
            System.out.println("The company " + name+" does not exist!");
            return null;}
        return company;
    }

    public static Company addDepartment(Company company, String name){

        boolean flag=false;
        Department department = new Department();
        ArrayList<Worker> workers = new ArrayList<>();
        TreeSet<Department> departments = company.getDepartments();
        for (Department department1 : departments) {
            if(department1.getName().equals(name)){
                flag=true;
            }
        }
        if(flag){
            System.out.println("The department " + name+" already exists!");
            return company;
        }else {
            department.setName(name);
            department.setWorkers(workers);
            departments.add(department);
            companies.add(company);
        }
        return company;
    }

    public static Company removeDepartment(Company company, String name){

        boolean flag=false;
        TreeSet<Department> departments = company.getDepartments();

        Iterator<Department> iterator = departments.iterator();
        while (iterator.hasNext()){
            Department next = iterator.next();
            if (next.getName().equals(name)){
                iterator.remove();
                company.setDepartments(departments);
                flag=true;
                return company;
            }
        }

        if(!flag){
            System.out.println("The department " + name+" does not exist!");
            r.reply("The department " + name+" does not exist!");
            return company;
        }
        return company;
    }


    public static Department selectDepartment(Company company, String name){

        boolean flag=false;
        Department department = new Department();
        TreeSet<Department> departments = company.getDepartments();
        for (Department department1 : departments) {
            if(department1.getName().equals(name)){
                department= department1;
                flag=true;
                return department;
            }
        }
        if(!flag){
            System.out.println("The department " + name+" does not exist!");
            return null;}
        return department;
    }

    public static Department addWorker(Company company, Department department, String name){

        Random random = new Random ();
        Worker worker = new Worker();
        ArrayList<Worker> workers = department.getWorkers();
        TreeSet<Department> departments = company.getDepartments();
        worker.setName(name);
        worker.setQualification(random.nextInt(10));
        workers.add(worker);
        department.setWorkers(workers);
        departments.add(department);
        company.setDepartments(departments);
        companies.add(company);
        return department;
    }

    public static Worker removeWorker(Company company, Department department, String name){

        boolean flag=false;
        Worker worker = new Worker();
        ArrayList<Worker> workers = department.getWorkers();
        TreeSet<Department> departments = company.getDepartments();
        for (Worker worker1 : workers) {
            if (worker1.getName().equals(name)){
                flag=true;
                worker = worker1;
                workers.remove(worker1);
                department.setWorkers(workers);
                departments.add(department);
                company.setDepartments(departments);
                companies.add(company);
                return worker;
            }
        }
        if(!flag){
            System.out.println("The worker "+name+" does not exist in department "+department.getName()+" of company "+company.getName());
            return worker;
        }
        return worker;
    }

    public static void printGoodWorkers(Department department){
        String reply = "There are workers with qualification above-average: \n";
        for (Worker worker : department.getWorkers()) {
            if(worker.getQualification()>=6){
                reply+= worker.toString();
            }
        }
        System.out.println(reply);
    }

    public static void printBadWorkers(Department department){
        String reply = "There are workers with qualification below-average: \n";
        for (Worker worker : department.getWorkers()) {
            if(worker.getQualification()<=5){
                reply+= worker.toString();
            }
        }
        System.out.println(reply);
    }

    static String getRequestMainMenu(TreeSet<Company> companies){

        String list = "There are following companies: \n";
        int i =1;
        for (Company company1 : companies) {
            list+=i+".  "+company1.getName()+"\n";
            i++;
        }
        System.out.println(list);
        return "Select the option: \n"+
                "                   \n"+
                "- type A - create and add a new company \n"+
                "                   \n"+
                "- type D - remove a company \n"+
                "                   \n"+
                "- To fill the staff select the name of a company from a list below: \n"+
                list+"\n"+
                "- press Cancel to exit";
    }

    public static boolean mainMenu(TreeSet<Company> companies){
        Company company ;

        String request = getRequestMainMenu(companies);

        while (true) {
            r.mainMenu(request);
            if (r.responseMainMenu == null) {
                return false;
            } else if (r.responseMainMenu.equals("A")) {
                    r.addCompany();
                    String addCompanyName = r.addCompanyName;
                    companies = addCompany(addCompanyName);
                    request = getRequestMainMenu(companies);
                    System.out.println(companies);
                } else if (r.responseMainMenu.equals("D")){
                    r.deleteCompany();
                    String deleteCompanyName = r.deleteCompanyName;
                    companies = removeCompany(deleteCompanyName);
                    request = getRequestMainMenu(companies);
                }
                else {
                    String selectCompanyName = r.responseMainMenu;
                    company = selectCompany(selectCompanyName);
                    System.out.println(company);
                }

        }
    }



    public static void main(String[] args) {

        mainMenu(companies);
    }
}

