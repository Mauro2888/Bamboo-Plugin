package com.cx.client.osa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

 class Content {
     @JsonRawValue
     @JsonProperty("projects")
     String projects;

     public Content(String projects) {
         this.projects = projects;
     }

     public String getProjects() {
         return projects;
     }

     public void setProjects(String projects) {

     }
 }
