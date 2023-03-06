import java.util.*;
public class School {
    public List<String> info;
    public List<String> years;
    public Float scores[];
    public Float avgs[];
    public Double sds[];
    private int school;
    private int year;
    private String schoolname;
    private Address address;
    private Principal principal;
    private Mark marks;

    //setter
    public void setyear(int year){
        this.year = year;
    }
    public void setschoolname(String schoolname){
        this.schoolname = schoolname;
    }
    public void setaddress(Address address){
        this.address = address;
    }
    public void setprincipal(Principal principal){
        this.principal = principal;
    }
    public void setNumScore(Mark marks){
        this.marks = marks;
    }

    //getter
    public int getyear(){
        return year;
    }
    public String getschoolname(){
        return schoolname;
    }
    public Address getaddress(){
        return address;
    }
    public Principal getprincipal(){
        return principal;
    }


    //appending the schools data into array
    public void schoolsInfo(int nums){
        this.school = nums;
        info=new ArrayList<String>(nums);
        years = new ArrayList<String>(nums);
        scores = new Float[nums];
    }
    
    public void schoolsAvg(int nums){
        avgs = new Float[nums];
    }

    public void schoolsSD(int nums){
        sds = new Double[nums];

    }
    
    //printing output
    public String getsum(String search){
        String answer ="";
        
        for (int i = 0; i < years.size(); i++) {
            if (years.get(i).equals(search)){
                String result = " The data year of school: "+years.get(i)+"\n The name of school: "+info.get(i)+"\n The score of the school: "+scores[i] + "\n"+"\n";
                answer += result;
            }

        }
        return answer;
    }
    
    public String getavg(String finder){
        String average ="";
        
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).equals(finder)){
                String result = "\n The name of school: "+info.get(i)+"\n The average score of the school: "+avgs[i] + "\n"+"\n";
                average += result;
            }

        }
        return average;
    }
    
    public String getsds(String find){
        String standard ="";
        
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).equals(find)){
                String result = "\n The name of school: "+info.get(i)+"\n The standard deviation of the school: "+sds[i] + "\n"+"\n";
                standard += result;
            }

        }
        return standard;
    }
}