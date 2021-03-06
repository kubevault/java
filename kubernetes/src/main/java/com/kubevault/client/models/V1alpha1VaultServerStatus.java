/*
 * KubeVault
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * Contact: kubevault@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kubevault.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kubevault.client.models.V1alpha1VaultStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1VaultServerStatus
 */

public class V1alpha1VaultServerStatus {
  @SerializedName("clientPort")
  private Integer clientPort = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("updatedNodes")
  private List<String> updatedNodes = null;

  @SerializedName("vaultStatus")
  private V1alpha1VaultStatus vaultStatus = null;

  public V1alpha1VaultServerStatus clientPort(Integer clientPort) {
    this.clientPort = clientPort;
    return this;
  }

   /**
   * ClientPort is the port for vault client to access. It&#39;s the same on client LB service and vault nodes.
   * @return clientPort
  **/
  @ApiModelProperty(value = "ClientPort is the port for vault client to access. It's the same on client LB service and vault nodes.")
  public Integer getClientPort() {
    return clientPort;
  }

  public void setClientPort(Integer clientPort) {
    this.clientPort = clientPort;
  }

  public V1alpha1VaultServerStatus initialized(Boolean initialized) {
    this.initialized = initialized;
    return this;
  }

   /**
   * Initialized indicates if the Vault service is initialized.
   * @return initialized
  **/
  @ApiModelProperty(value = "Initialized indicates if the Vault service is initialized.")
  public Boolean isInitialized() {
    return initialized;
  }

  public void setInitialized(Boolean initialized) {
    this.initialized = initialized;
  }

  public V1alpha1VaultServerStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Phase indicates the state this Vault cluster jumps in. Phase goes as one way as below:   Initial -&gt; Running
   * @return phase
  **/
  @ApiModelProperty(value = "Phase indicates the state this Vault cluster jumps in. Phase goes as one way as below:   Initial -> Running")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1alpha1VaultServerStatus serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * ServiceName is the LB service for accessing vault nodes.
   * @return serviceName
  **/
  @ApiModelProperty(value = "ServiceName is the LB service for accessing vault nodes.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public V1alpha1VaultServerStatus updatedNodes(List<String> updatedNodes) {
    this.updatedNodes = updatedNodes;
    return this;
  }

  public V1alpha1VaultServerStatus addUpdatedNodesItem(String updatedNodesItem) {
    if (this.updatedNodes == null) {
      this.updatedNodes = new ArrayList<String>();
    }
    this.updatedNodes.add(updatedNodesItem);
    return this;
  }

   /**
   * PodNames of updated Vault nodes. Updated means the Vault container image version matches the spec&#39;s version.
   * @return updatedNodes
  **/
  @ApiModelProperty(value = "PodNames of updated Vault nodes. Updated means the Vault container image version matches the spec's version.")
  public List<String> getUpdatedNodes() {
    return updatedNodes;
  }

  public void setUpdatedNodes(List<String> updatedNodes) {
    this.updatedNodes = updatedNodes;
  }

  public V1alpha1VaultServerStatus vaultStatus(V1alpha1VaultStatus vaultStatus) {
    this.vaultStatus = vaultStatus;
    return this;
  }

   /**
   * VaultStatus is the set of Vault node specific statuses: Active, Standby, and Sealed
   * @return vaultStatus
  **/
  @ApiModelProperty(value = "VaultStatus is the set of Vault node specific statuses: Active, Standby, and Sealed")
  public V1alpha1VaultStatus getVaultStatus() {
    return vaultStatus;
  }

  public void setVaultStatus(V1alpha1VaultStatus vaultStatus) {
    this.vaultStatus = vaultStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1VaultServerStatus v1alpha1VaultServerStatus = (V1alpha1VaultServerStatus) o;
    return Objects.equals(this.clientPort, v1alpha1VaultServerStatus.clientPort) &&
        Objects.equals(this.initialized, v1alpha1VaultServerStatus.initialized) &&
        Objects.equals(this.phase, v1alpha1VaultServerStatus.phase) &&
        Objects.equals(this.serviceName, v1alpha1VaultServerStatus.serviceName) &&
        Objects.equals(this.updatedNodes, v1alpha1VaultServerStatus.updatedNodes) &&
        Objects.equals(this.vaultStatus, v1alpha1VaultServerStatus.vaultStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientPort, initialized, phase, serviceName, updatedNodes, vaultStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1VaultServerStatus {\n");
    
    sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    updatedNodes: ").append(toIndentedString(updatedNodes)).append("\n");
    sb.append("    vaultStatus: ").append(toIndentedString(vaultStatus)).append("\n");
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

