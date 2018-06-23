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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * vault doc: https://www.vaultproject.io/docs/configuration/storage/etcd.html  EtcdSpec defines configuration to set up etcd as backend storage in vault
 */
@ApiModel(description = "vault doc: https://www.vaultproject.io/docs/configuration/storage/etcd.html  EtcdSpec defines configuration to set up etcd as backend storage in vault")

public class V1alpha1EtcdSpec {
  @SerializedName("address")
  private String address = null;

  @SerializedName("credentialSecretName")
  private String credentialSecretName = null;

  @SerializedName("discoverySrv")
  private String discoverySrv = null;

  @SerializedName("etcdApi")
  private String etcdApi = null;

  @SerializedName("haEnable")
  private Boolean haEnable = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("sync")
  private Boolean sync = null;

  @SerializedName("tlsSecretName")
  private String tlsSecretName = null;

  public V1alpha1EtcdSpec address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Specifies the addresses of the etcd instances
   * @return address
  **/
  @ApiModelProperty(value = "Specifies the addresses of the etcd instances")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public V1alpha1EtcdSpec credentialSecretName(String credentialSecretName) {
    this.credentialSecretName = credentialSecretName;
    return this;
  }

   /**
   * Specifies the secret name that contain username and password to use when authenticating with the etcd server
   * @return credentialSecretName
  **/
  @ApiModelProperty(value = "Specifies the secret name that contain username and password to use when authenticating with the etcd server")
  public String getCredentialSecretName() {
    return credentialSecretName;
  }

  public void setCredentialSecretName(String credentialSecretName) {
    this.credentialSecretName = credentialSecretName;
  }

  public V1alpha1EtcdSpec discoverySrv(String discoverySrv) {
    this.discoverySrv = discoverySrv;
    return this;
  }

   /**
   * Specifies the domain name to query for SRV records describing cluster endpoints
   * @return discoverySrv
  **/
  @ApiModelProperty(value = "Specifies the domain name to query for SRV records describing cluster endpoints")
  public String getDiscoverySrv() {
    return discoverySrv;
  }

  public void setDiscoverySrv(String discoverySrv) {
    this.discoverySrv = discoverySrv;
  }

  public V1alpha1EtcdSpec etcdApi(String etcdApi) {
    this.etcdApi = etcdApi;
    return this;
  }

   /**
   * Specifies the version of the API to communicate with etcd
   * @return etcdApi
  **/
  @ApiModelProperty(value = "Specifies the version of the API to communicate with etcd")
  public String getEtcdApi() {
    return etcdApi;
  }

  public void setEtcdApi(String etcdApi) {
    this.etcdApi = etcdApi;
  }

  public V1alpha1EtcdSpec haEnable(Boolean haEnable) {
    this.haEnable = haEnable;
    return this;
  }

   /**
   * Specifies if high availability should be enabled
   * @return haEnable
  **/
  @ApiModelProperty(value = "Specifies if high availability should be enabled")
  public Boolean isHaEnable() {
    return haEnable;
  }

  public void setHaEnable(Boolean haEnable) {
    this.haEnable = haEnable;
  }

  public V1alpha1EtcdSpec path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Specifies the path in etcd where vault data will be stored
   * @return path
  **/
  @ApiModelProperty(value = "Specifies the path in etcd where vault data will be stored")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1alpha1EtcdSpec sync(Boolean sync) {
    this.sync = sync;
    return this;
  }

   /**
   * Specifies whether to sync list of available etcd services on startup
   * @return sync
  **/
  @ApiModelProperty(value = "Specifies whether to sync list of available etcd services on startup")
  public Boolean isSync() {
    return sync;
  }

  public void setSync(Boolean sync) {
    this.sync = sync;
  }

  public V1alpha1EtcdSpec tlsSecretName(String tlsSecretName) {
    this.tlsSecretName = tlsSecretName;
    return this;
  }

   /**
   * Specifies the secret name that contains tls_ca_file, tls_cert_file and tls_key_file for etcd communication
   * @return tlsSecretName
  **/
  @ApiModelProperty(value = "Specifies the secret name that contains tls_ca_file, tls_cert_file and tls_key_file for etcd communication")
  public String getTlsSecretName() {
    return tlsSecretName;
  }

  public void setTlsSecretName(String tlsSecretName) {
    this.tlsSecretName = tlsSecretName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1EtcdSpec v1alpha1EtcdSpec = (V1alpha1EtcdSpec) o;
    return Objects.equals(this.address, v1alpha1EtcdSpec.address) &&
        Objects.equals(this.credentialSecretName, v1alpha1EtcdSpec.credentialSecretName) &&
        Objects.equals(this.discoverySrv, v1alpha1EtcdSpec.discoverySrv) &&
        Objects.equals(this.etcdApi, v1alpha1EtcdSpec.etcdApi) &&
        Objects.equals(this.haEnable, v1alpha1EtcdSpec.haEnable) &&
        Objects.equals(this.path, v1alpha1EtcdSpec.path) &&
        Objects.equals(this.sync, v1alpha1EtcdSpec.sync) &&
        Objects.equals(this.tlsSecretName, v1alpha1EtcdSpec.tlsSecretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, credentialSecretName, discoverySrv, etcdApi, haEnable, path, sync, tlsSecretName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1EtcdSpec {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    credentialSecretName: ").append(toIndentedString(credentialSecretName)).append("\n");
    sb.append("    discoverySrv: ").append(toIndentedString(discoverySrv)).append("\n");
    sb.append("    etcdApi: ").append(toIndentedString(etcdApi)).append("\n");
    sb.append("    haEnable: ").append(toIndentedString(haEnable)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
    sb.append("    tlsSecretName: ").append(toIndentedString(tlsSecretName)).append("\n");
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
