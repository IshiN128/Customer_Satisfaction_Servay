package com.example.cs;

public class storeData4 {

    private String aptNo;
    private String vote = "Poor";

    public storeData4()
    {
    }

    public storeData4(String aptNO){
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
