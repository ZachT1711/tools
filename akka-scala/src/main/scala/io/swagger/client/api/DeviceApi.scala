/**
 * home-iot-api
 * The API for the EatBacon IOT project
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.DeviceRegistrationInfo
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DeviceApi {

  /**
   * returns all registered devices
   * 
   * Expected answers:
   *   code 200 : Seq[String] (All the devices)
   * 
   * @param skip number of records to skip
   * @param limit max number of records to return
   */
  def getDevices(skip: Option[Int] = None, limit: Option[Int] = None): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://virtserver.swaggerhub.com/ZachT1711/Zach/1.0.0", "/devices", "application/json")
      .withQueryParam("skip", skip)
      .withQueryParam("limit", limit)
      .withSuccessResponse[Seq[String]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successfully registered device)
   * 
   * @param device 
   */
  def register(device: Option[DeviceRegistrationInfo] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/ZachT1711/Zach/1.0.0", "/devices", "application/json")
      .withBody(device)
      .withSuccessResponse[Unit](200)
      

}

