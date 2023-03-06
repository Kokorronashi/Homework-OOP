import java.lang.Math;
public class Mark {
    public float score[];
    private int id[];
    private String name[];
    private String classname[];
    private int numdata;

    public Mark(int numdata){
        createData(numdata);
    }
    public void createData(int numdat){
        score = new float[numdat];
        id = new int[numdat];
        name = new String[numdat];
        classname = new String[numdat];
        for(int i = 0; i < numdat;i++){
            score[i] = 0;
            id[i] = 0;
            name[i] = new String();
            classname[i]= "";
        }
        numdata = numdat;
    }
    
    public double calculateSD(float score[])
    {   this.score = score;
        double sum = 0.0, standardDeviation = 0.0;
        int length = score.length;

        for(double num : score) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: score) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
    
    public float sums(){
        float total = 0;
        for(int i=0; i < numdata; i++){
            total+= score[i];
        }
        return total;
    }
    public float calcAvg(){
        float sum = 0;
        for(int i=0; i < numdata; i++){
            sum+= score[i];
        }
    float avg = sum /numdata;
    return avg;
    }
    public void setMark(float score, int index){
        this.score[index]=score;
    }
    public float getMark(int index){
        return score[index];
    }
    public void setId(int id, int index){
        this.id[index]=id;
    }
    public int getId(int index){
        return id[index];
    }
    public void setName(String name, int index){
        this.name[index]=name;
    }
    public String getName(int index){
        return name[index];
    }
    public void setClassname(String classname, int index){
        this.classname[index]=classname;
    }
    public String getClassname(int index){
        return classname[index];
    }

}