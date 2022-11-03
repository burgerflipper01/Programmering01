package Copier;

public class Copier {

    private int paper;

    private boolean paperStruck = false;

    public Copier(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return paper;
    }

    public void insertPaper(int paper) {
        if (paper + this.paper > 500){
            System.out.println("hov du der ikke mere end 500");
            return;
        }

        this.paper = this.paper + paper;

    }

    public void makeCopy(){
        this.paper = this.paper - 1;
    }
    public void makeCopy(int copies){
        if (paperStruck == false && paper > copies){
            this.paper = this.paper - copies;
        }
        else if(paperStruck == true){
            System.out.println("Paperjam");
        }

        else{
            System.out.println("Der er ikke nok papir");

        }

    }
    public void makePaperJam(){
        paperStruck = true;

    }
    public void fixJam(){
        paperStruck = false;
    }



}
