package com.example.Banks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Accounts
{
    @JsonProperty("Account")
    private String account;

    @JsonProperty("RegulationAccountType")
    private String regulationAccountType;

    @JsonProperty("CK")
    private String CK;

    @JsonProperty("AccountCBRBIC")
    private int accountCBRBIC;

    @JsonProperty("DateIn")
    private String dateIn;

    @JsonProperty("DateOut")
    private String dateOut;

    @JsonProperty("AccountStatus")
    private String accountStatus;

    @JsonProperty("AccRstrList")
    private AccRstrList accrstrlist;
}