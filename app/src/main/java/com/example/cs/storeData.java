package com.example.cs;

public class storeData {

    private String aptNo;
    private String vote = "good";

    public storeData()
    {
    }

    public storeData(String aptNO){
        this.aptNo=aptNO;

    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }
}
