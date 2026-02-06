package OPP;

import java.util.Scanner;

public class Student {
    public Student(){

    }

    private int ObtainMarks;
    private int totalMarks;
    private float percentage;
    public Student(int ObtainMarks,int totalMarks,float percentage){

        this.ObtainMarks=ObtainMarks;
        this.totalMarks=totalMarks;
        this.percentage=percentage;

    }
    public void setTotalMarks(int totalMarks){
        Scanner input=new Scanner(System.in);
        System.out.println(" enter  total Marks ");
        int marks=input.nextInt();
        totalMarks=marks;
    }
    public void setMarks(int ObtainMarks){



        this.ObtainMarks=ObtainMarks;

    }
    public int getObtainMarks(){
        return ObtainMarks;
    }
    public float getPercentage(){
        percentage=totalMarks/ObtainMarks*100;
        return percentage;
    }



}

