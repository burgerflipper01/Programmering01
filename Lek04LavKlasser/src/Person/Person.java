package Person;



public class Person {

    //Atributter
    private String name;

    private String adress;

    private double monthlySalary;

    private double yearlySalary;

    private int previousWork;

    //Constructer
    public Person(String inputName, String inputAdress, double inputMonthlySalary){
        name = inputName;
        adress = inputAdress;
        monthlySalary = inputMonthlySalary;

    }

    public void setName(String inputName){
        name = inputName;
    }

    public String getName(String inputName){
        return inputName;
    }

    public void setAdress(String inputAdress){
        adress = inputAdress;
    }
    public String getAdress(String inputAdress){
        return inputAdress;
    }

    public void setMonthySalary(double inputMonthlySalary){
        monthlySalary = inputMonthlySalary;
    }

    public double getMonthlySalary(double inputMonthlySalary){
        return inputMonthlySalary;
    }
    //public void setYearlySalary(double inputYearlySalary){
      //  yearlySalary = monthlySalary * 12;


    public double getYearlySalary(){
        return monthlySalary * 12 * 1.025;
    }


    //public double getMonthlySalary
    //public double maenedsloenOgFeriepenge(){

    //}

    public void PrintPeron(){
        System.out.println("Navn " + name);
        System.out.println("Adresse " + adress);
        System.out.println("Månedsløn " + monthlySalary);
    }

}
