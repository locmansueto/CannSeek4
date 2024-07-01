/*
 * BrAPI implementation for PIPPA
 * A first draft implementation of the breeding API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.brapi.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.brapi.client.model.Location;

/**
 * StudyEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-31T12:16:05.949+02:00")
public class StudyEntry {
  @SerializedName("studyName")
  private String studyName = null;

  @SerializedName("studyDbId")
  private String studyDbId = null;

  @SerializedName("studyType")
  private String studyType = null;

  @SerializedName("seasons")
  private List<String> seasons = new ArrayList<String>();

  @SerializedName("trialDbId")
  private String trialDbId = null;

  @SerializedName("trialName")
  private String trialName = null;

  @SerializedName("startDate")
  private String startDate = null;

  @SerializedName("endDate")
  private String endDate = null;

  @SerializedName("active")
  private String active = null;

  @SerializedName("location")
  private Location location = null;

  public StudyEntry studyName(String studyName) {
    this.studyName = studyName;
    return this;
  }

   /**
   * Get studyName
   * @return studyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudyName() {
    return studyName;
  }

  public void setStudyName(String studyName) {
    this.studyName = studyName;
  }

  public StudyEntry studyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

   /**
   * Get studyDbId
   * @return studyDbId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudyDbId() {
    return studyDbId;
  }

  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }

  public StudyEntry studyType(String studyType) {
    this.studyType = studyType;
    return this;
  }

   /**
   * Get studyType
   * @return studyType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudyType() {
    return studyType;
  }

  public void setStudyType(String studyType) {
    this.studyType = studyType;
  }

  public StudyEntry seasons(List<String> seasons) {
    this.seasons = seasons;
    return this;
  }

  public StudyEntry addSeasonsItem(String seasonsItem) {
    this.seasons.add(seasonsItem);
    return this;
  }

   /**
   * Get seasons
   * @return seasons
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getSeasons() {
    return seasons;
  }

  public void setSeasons(List<String> seasons) {
    this.seasons = seasons;
  }

  public StudyEntry trialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
    return this;
  }

   /**
   * Get trialDbId
   * @return trialDbId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTrialDbId() {
    return trialDbId;
  }

  public void setTrialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
  }

  public StudyEntry trialName(String trialName) {
    this.trialName = trialName;
    return this;
  }

   /**
   * Get trialName
   * @return trialName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTrialName() {
    return trialName;
  }

  public void setTrialName(String trialName) {
    this.trialName = trialName;
  }

  public StudyEntry startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public StudyEntry endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public StudyEntry active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public StudyEntry location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudyEntry studyEntry = (StudyEntry) o;
    return Objects.equals(this.studyName, studyEntry.studyName) &&
        Objects.equals(this.studyDbId, studyEntry.studyDbId) &&
        Objects.equals(this.studyType, studyEntry.studyType) &&
        Objects.equals(this.seasons, studyEntry.seasons) &&
        Objects.equals(this.trialDbId, studyEntry.trialDbId) &&
        Objects.equals(this.trialName, studyEntry.trialName) &&
        Objects.equals(this.startDate, studyEntry.startDate) &&
        Objects.equals(this.endDate, studyEntry.endDate) &&
        Objects.equals(this.active, studyEntry.active) &&
        Objects.equals(this.location, studyEntry.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studyName, studyDbId, studyType, seasons, trialDbId, trialName, startDate, endDate, active, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyEntry {\n");
    
    sb.append("    studyName: ").append(toIndentedString(studyName)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    studyType: ").append(toIndentedString(studyType)).append("\n");
    sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
    sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
    sb.append("    trialName: ").append(toIndentedString(trialName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

