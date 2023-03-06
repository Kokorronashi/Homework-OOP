import java.util.Scanner;
public class Main {

    public static void main(String[] Args){
        School name = new School();
        float average = 0;
        float total = 0;
        double stddev = 0;
        int tracker = 0;
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the number of school detail you want to enter: ");
        int counter = t.nextInt();
        int huh = counter;
        name.schoolsInfo(counter);
        name.schoolsAvg(huh);
        name.schoolsSD(counter);
        for(int r = 0; r< counter;r++){
            
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the data year for School "+(tracker+1)+": ");
        int input1 = a.nextInt();
        name.setyear(input1);
        name.years.add(Integer.toString(input1));

        Scanner b = new Scanner(System.in);
        System.out.print("Enter the school "+(tracker+1)+" name: ");
        String input2 = b.nextLine();
        name.setschoolname(input2);
        name.info.add(input2);

        Scanner c = new Scanner(System.in);
        System.out.print("Enter the street of the school: ");
        String input3 = c.nextLine();

        Scanner d = new Scanner(System.in);
        System.out.print("Enter the district of the school: ");
        String input4 = d.nextLine();

        Scanner e = new Scanner(System.in);
        System.out.print("Enter the postcode of the school: ");
        String input5 = e.nextLine();

        Scanner f = new Scanner(System.in);
        System.out.print("Enter the state of the school: ");
        String input6 = f.nextLine();

        Address addr = new Address(input3,input4,input5,input6);
        name.setaddress(addr);
        
        Scanner g = new Scanner(System.in);
        System.out.print("Enter the first name of the Principal: ");
        String input7 = g.nextLine();
        
        Scanner h = new Scanner(System.in);
        System.out.print("Enter the last name of the Principal: ");
        String input8 = h.nextLine();
        
        Principal pname = new Principal(input7,input8);
        name.setprincipal(pname);
        
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the number of students to key in their details: ");
        int input9 = i.nextInt();
        Mark marks = new Mark(input9);
        name.setNumScore(marks);

        for(int xx = 0; xx < input9;xx++){
            Scanner x = new Scanner(System.in);
            System.out.print("Enter the name of Student " +(xx+1)+": ");
            String input10 = x.nextLine();
            marks.setName(input10,xx);
            
            Scanner y = new Scanner(System.in);
            System.out.print("Enter the ID of Student "+(xx+1)+": ");
            int input11 = y.nextInt();
            marks.setId(input11,xx);
            
            Scanner z = new Scanner(System.in);
            System.out.print("Enter the class name of Student "+(xx+1)+": ");
            String input12 = z.nextLine();
            marks.setClassname(input12,xx);
            
            Scanner w = new Scanner(System.in);
            System.out.print("Enter the score of Student "+(xx+1)+": ");
            float input13 = w.nextFloat();
            marks.setMark(input13,xx);
        }
        System.out.println(" ");
        total = marks.sums();
        name.scores[tracker] = total;
        average = marks.calcAvg();
        name.avgs[tracker] = average;
        stddev = marks.calculateSD(marks.score);
        name.sds[tracker] = stddev;
        System.out.println("The average score of this school is: "+average);
        System.out.println("The standard deviation of this school is: "+stddev);
        System.out.println("The total score of this school is: "+total);
        tracker++;
        if (tracker == counter){
            break;
        }
        
        }
        //Output
        
        Scanner l = new Scanner(System.in);
        System.out.print("Enter the year of the school: ");
        String ok = l.nextLine();
        System.out.print(name.getsum(ok));
        
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the name of the school to view average: ");
        String put = r.nextLine();
        System.out.print(name.getavg(put));
        
        Scanner mm = new Scanner(System.in);
        System.out.print("Enter the name of the school to view standard deviation: ");
        String out = mm.nextLine();
        System.out.print(name.getsds(out));

    }
}