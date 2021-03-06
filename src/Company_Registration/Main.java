package Company_Registration;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Random;
import java.util.Random;
/**
 * Created by okten29 on 11/26/18.
 */
public class Main {

    static TreeSet<Company> companies = new TreeSet<>();

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



    public static void main(String[] args) {
        companies = addCompany("Alfa");
        Company beta = selectCompany("Beta");
        companies = addCompany("Alfa");
        Company alfa = selectCompany("Alfa");
        System.out.println(alfa);

        alfa = addDepartment(alfa, "FirstDepartment");
        Department secondDepartment = selectDepartment(alfa, "SecondDepartment");
        alfa = addDepartment(alfa, "FirstDepartment");
        Department firstDepartment = selectDepartment(alfa, "FirstDepartment");
        System.out.println(alfa);
        //System.out.println(firstDepartment.toString());

        firstDepartment = addWorker(alfa, firstDepartment, "Bob");
        firstDepartment = addWorker(alfa, firstDepartment, "Dilan");
        firstDepartment = addWorker(alfa, firstDepartment, "John");
        System.out.println(firstDepartment);

        Worker worker1 = removeWorker(alfa, firstDepartment, "Faked Worker");
        Worker worker2 = removeWorker(alfa, firstDepartment, "Dilan");
        //System.out.println(worker2);
       // System.out.println(alfa);

        firstDepartment = addWorker(alfa, firstDepartment, "Edik");
        System.out.println(firstDepartment);
        firstDepartment = addWorker(alfa, firstDepartment, "Maxim");
        System.out.println(firstDepartment);
        firstDepartment = addWorker(alfa, firstDepartment, "Richard");
        System.out.println(firstDepartment);
        //printGoodWorkers(firstDepartment);
        //printBadWorkers(firstDepartment);
        //System.out.println(alfa);
    }
}
