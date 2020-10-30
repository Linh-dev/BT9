package com.company;

public class Journal extends Document {
    private int number;
    private int issueMon;

    public Journal() {
        super();
    }

    public Journal(int id, String publishingCompany, String issueNumber, int number, int issueMon) {
        super(id, publishingCompany, issueNumber);
        this.number = number;
        this.issueMon = issueMon;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getIssueMon() {
        return issueMon;
    }
    public void setIssueMon(int issueMon) {
        this.issueMon = issueMon;
    }

    @Override
    public String toString() {
        return "Journal{" +super.toString()+
                "number=" + number +
                ", issueMon=" + issueMon +
                '}';
    }
}
