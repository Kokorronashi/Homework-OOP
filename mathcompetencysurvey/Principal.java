public class Principal {

    public Principal(String fname,String lname ){
        this.fname = fname;
        this.lname = lname;
    }
    private String fname;
    private String lname;

    //setter
    public void setfname(String fname){
        this.fname = fname;
    }
    public void setlname(String lname){
        this.lname = lname;
    }

    //getter
    public String getfname(){
        return fname;
    }
    public String getlname(){
        return lname;
    }
    public String toString(){
        return fname +" "+lname;
    }
}
