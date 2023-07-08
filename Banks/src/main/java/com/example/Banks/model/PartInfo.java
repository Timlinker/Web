package com.example.Banks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PartInfo
{
    @JsonProperty("PartNo")
    private int PartNo;

    @JsonProperty("PartQuantity")
    private int PartQuantity;

    @JsonProperty("PartAggregateID")
    private String PartAggregateID;

}