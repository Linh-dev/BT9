package com.company;

public class Newspaper extends Document {
    private int issueDate;

    public Newspaper(){
        super();
    }

    public Newspaper(int id, String publishingCompany, String issueNumber, int issueDate) {
        super(id, publishingCompany, issueNumber);
        this.issueDate = issueDate;
    }

    public void setIssueDate(int issueDate){
        this.issueDate = issueDate;
    }

    public int getIssueDate(){
        return issueDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +super.toString()+
                "issueDate=" + issueDate +
                '}';
    }
}
