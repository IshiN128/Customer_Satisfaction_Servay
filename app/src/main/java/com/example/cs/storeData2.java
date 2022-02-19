package com.example.cs;

public class storeData2 {

    private String aptNo;
    private String vote = "Good";

    public storeData2()
    {
    }

    public storeData2(String aptNO){
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
