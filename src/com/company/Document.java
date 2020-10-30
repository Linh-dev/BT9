package com.company;

public class Document {
    private int id;
    private String publishingCompany;
    private String issueNumber;

    public Document(){}

    public Document(int id, String publishingCompany, String issueNumber) {
        this.id = id;
        this.publishingCompany = publishingCompany;
        this.issueNumber = issueNumber;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }
    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", issueNumber='" + issueNumber + '\'' +
                '}';
    }
}
