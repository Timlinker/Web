package com.example.Banks.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import java.util.List;

@Data
@JsonRootName("ED807")
public class ED807
{
    @JsonProperty("xmlns")
    private String xmlns;

    @JsonProperty("EDNo")
    private long EDNo;

    @JsonProperty("EDDate")
    private String EDDate;

    @JsonProperty("EDAuthor")
    private long EDAuthor;

    @JsonProperty("EDReceiver")
    private long EDReceiver;

    @JsonProperty("CreationReason")
    private int CreationReason;

    @JsonProperty("CreationDateTime")
    private String CreationDateTime;

    @JsonProperty("InfoTypeCode")
    private int InfoTypeCode;

    @JsonProperty("BusinessDay")
    private String BusinessDay;

    @JsonProperty("DirectoryVersion")
    private int DirectoryVersion;

    @JsonProperty("BICDirectoryEntry")
    private List<BICDirectoryEntry> bicDirectoryEntry;

    @JsonProperty("PartInfo")
    private List<PartInfo> partinfo;

    @JsonProperty("InitialED")
    private List<InitialED> initialed;

}