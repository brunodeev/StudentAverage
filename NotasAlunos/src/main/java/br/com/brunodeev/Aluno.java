package br.com.brunodeev;

import java.util.List;

public class Aluno {
    public String name;
    public List<Double> grades;

    public double isApproved(){
        double result = 0;
        for (double grade : grades) {
            result += grade;
        }
        return result / grades.size();
    }
}
