package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "localName",
        "name",
        "countryCode",
        "fixed",
        "global",
        "counties",
        "launchYear",
        "type"
})
public class Holidays {

    @JsonProperty("date")
    private String date;
    @JsonProperty("localName")
    private String localName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("fixed")
    private boolean fixed;
    @JsonProperty("global")
    private boolean global;
    @JsonProperty("counties")
    private Object counties;
    @JsonProperty("launchYear")
    private Object launchYear;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Holidays() {
    }

    /**
     *
     * @param date
     * @param localName
     * @param launchYear
     * @param countryCode
     * @param name
     * @param fixed
     * @param global
     * @param counties
     * @param type
     */
    public Holidays(String date, String localName, String name, String countryCode, boolean fixed, boolean global, Object counties, Object launchYear, String type) {
        super();
        this.date = date;
        this.localName = localName;
        this.name = name;
        this.countryCode = countryCode;
        this.fixed = fixed;
        this.global = global;
        this.counties = counties;
        this.launchYear = launchYear;
        this.type = type;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("localName")
    public String getLocalName() {
        return localName;
    }

    @JsonProperty("localName")
    public void setLocalName(String localName) {
        this.localName = localName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("fixed")
    public boolean isFixed() {
        return fixed;
    }

    @JsonProperty("fixed")
    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    @JsonProperty("global")
    public boolean isGlobal() {
        return global;
    }

    @JsonProperty("global")
    public void setGlobal(boolean global) {
        this.global = global;
    }

    @JsonProperty("counties")
    public Object getCounties() {
        return counties;
    }

    @JsonProperty("counties")
    public void setCounties(Object counties) {
        this.counties = counties;
    }

    @JsonProperty("launchYear")
    public Object getLaunchYear() {
        return launchYear;
    }

    @JsonProperty("launchYear")
    public void setLaunchYear(Object launchYear) {
        this.launchYear = launchYear;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Holidays{" +
                "date='" + date + '\'' +
                ", localName='" + localName + '\'' +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", fixed=" + fixed +
                ", global=" + global +
                ", counties=" + counties +
                ", launchYear=" + launchYear +
                ", type='" + type + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}' + "\n";

    }

    public static Comparator<Holidays> byNameAsc = Comparator.comparing(o -> o.getName());
    public static Comparator<Holidays> byNameDesc = (o1, o2) -> o2.getName().compareTo(o1.getName());
}
