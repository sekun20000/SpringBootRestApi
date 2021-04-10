package com.taeyang;

public class grade10 {
    private String name ;
    private int midExam;
    private int finExam ;
    private int totalExam ;

    public grade10() {
    }

    public grade10(String name, int midExam, int finExam) {
        this.name = name;
        this.midExam = midExam;
        this.finExam = finExam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMidExam() {
        return midExam;
    }

    public void setMidExam(int midExam) {
        this.midExam = midExam;
    }

    public int getFinExam() {
        return finExam;
    }

    public void setFinExam(int finExam) {
        this.finExam = finExam;
    }

    public int getTotalExam() {
        return totalExam;
    }

    public void setTotalExam(int totalExam) {
        this.totalExam = totalExam;
    }

    @Override
    public String toString() {
        return "grade10{" +
                "name='" + name + '\'' +
                ", midExam=" + midExam +
                ", finExam=" + finExam +
                ", totalExam=" + totalExam +
                '}';
    }
}
