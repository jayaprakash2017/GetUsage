package com.demo.getusage.model;

import java.math.BigDecimal;

public class GetInfoResponse {

    private String name;
    private String msisdn;
    private BigDecimal voiceUsage;
    private long voiceLeftOverUsage;
    
    public GetInfoResponse()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMsisdn()
    {
        return msisdn;
    }

    public void setMsisdn(String msisdn)
    {
        this.msisdn = msisdn;
    }

    public BigDecimal getVoiceUsage()
    {
        return voiceUsage;
    }

    public void setVoiceUsage(BigDecimal voiceUsage)
    {
        this.voiceUsage = voiceUsage;
    }

    public long getVoiceLeftOverUsage()
    {
        return voiceLeftOverUsage;
    }

    public void setVoiceLeftOverUsage(long voiceLeftOverUsage)
    {
        this.voiceLeftOverUsage = voiceLeftOverUsage;
    }

    public BigDecimal getDataUsage()
    {
        return dataUsage;
    }

    public void setDataUsage(BigDecimal dataUsage)
    {
        this.dataUsage = dataUsage;
    }

    public long getDataLeftOverUsage()
    {
        return dataLeftOverUsage;
    }

    public void setDataLeftOverUsage(long dataLeftOverUsage)
    {
        this.dataLeftOverUsage = dataLeftOverUsage;
    }

    public String getWelcomeMessage()
    {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage)
    {
        this.welcomeMessage = welcomeMessage;
    }


    private BigDecimal dataUsage;
    private long dataLeftOverUsage;
    private String welcomeMessage;
}

