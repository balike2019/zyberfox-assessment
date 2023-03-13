package org.example.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"type",
"addressLineDetail",
"provinceOrState",
"cityOrTown",
"country",
"postalCode",
"lastUpdated",
"suburbOrDistrict"
})
@Generated("jsonschema2pojo")
public class Address {

@JsonProperty("id")
private String id;
@JsonProperty("type")
private Type type;
@JsonProperty("addressLineDetail")
private AddressLineDetail addressLineDetail;
@JsonProperty("provinceOrState")
private ProvinceOrState provinceOrState;
@JsonProperty("cityOrTown")
private String cityOrTown;
@JsonProperty("country")
private Country country;
@JsonProperty("postalCode")
private String postalCode;
@JsonProperty("lastUpdated")
private String lastUpdated;
@JsonProperty("suburbOrDistrict")
private String suburbOrDistrict;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("type")
public Type getType() {
return type;
}

@JsonProperty("type")
public void setType(Type type) {
this.type = type;
}

@JsonProperty("addressLineDetail")
public AddressLineDetail getAddressLineDetail() {
return addressLineDetail;
}

@JsonProperty("addressLineDetail")
public void setAddressLineDetail(AddressLineDetail addressLineDetail) {
this.addressLineDetail = addressLineDetail;
}

@JsonProperty("provinceOrState")
public ProvinceOrState getProvinceOrState() {
return provinceOrState;
}

@JsonProperty("provinceOrState")
public void setProvinceOrState(ProvinceOrState provinceOrState) {
this.provinceOrState = provinceOrState;
}

@JsonProperty("cityOrTown")
public String getCityOrTown() {
return cityOrTown;
}

@JsonProperty("cityOrTown")
public void setCityOrTown(String cityOrTown) {
this.cityOrTown = cityOrTown;
}

@JsonProperty("country")
public Country getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(Country country) {
this.country = country;
}

@JsonProperty("postalCode")
public String getPostalCode() {
return postalCode;
}

@JsonProperty("postalCode")
public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
}

@JsonProperty("lastUpdated")
public String getLastUpdated() {
return lastUpdated;
}

@JsonProperty("lastUpdated")
public void setLastUpdated(String lastUpdated) {
this.lastUpdated = lastUpdated;
}

@JsonProperty("suburbOrDistrict")
public String getSuburbOrDistrict() {
return suburbOrDistrict;
}

@JsonProperty("suburbOrDistrict")
public void setSuburbOrDistrict(String suburbOrDistrict) {
this.suburbOrDistrict = suburbOrDistrict;
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
        return "Address{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", addressLineDetail=" + addressLineDetail +
                ", provinceOrState=" + provinceOrState +
                ", cityOrTown='" + cityOrTown + '\'' +
                ", country=" + country +
                ", postalCode='" + postalCode + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", suburbOrDistrict='" + suburbOrDistrict + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
