package com.example.cs;

public class storeData3 {

    private String aptNo;
    private String vote = "Average";

    public storeData3()
    {
    }

    public storeData3(String aptNO){
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
