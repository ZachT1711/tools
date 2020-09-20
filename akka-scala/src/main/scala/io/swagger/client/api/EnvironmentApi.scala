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

import io.swagger.client.model.ApiResponse
import io.swagger.client.model.ForecastResponse
import io.swagger.client.model.HeaterState
import io.swagger.client.model.TemperatueZoneStatus
import io.swagger.client.model.TemperatureSummary
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object EnvironmentApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : ForecastResponse (the forecast)
   * 
   * @param days 
   */
  def getForecast(days: Int): ApiRequest[ForecastResponse] =
    ApiRequest[ForecastResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/ZachT1711/Zach/1.0.0", "/temperature/forecast/{days}", "application/json")
      .withPathParam("days", days)
      .withSuccessResponse[ForecastResponse](200)
        /**
   * gets the state of the heater
   * 
   * Expected answers:
   *   code 200 : HeaterState (heater state)
   * 
   * @param zoneId 
   */
  def getHeaterState(zoneId: String): ApiRequest[HeaterState] =
    ApiRequest[HeaterState](ApiMethods.GET, "https://virtserver.swaggerhub.com/ZachT1711/Zach/1.0.0", "/temperature/{zoneId}/heater", "application/json")
      .withPathParam("zoneId", zoneId)
      .withSuccessResponse[HeaterState](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : TemperatueZoneStatus (Zone temperature)
   * 
   * @param zoneId 
   */
  def getZoneTemperature(zoneId: String): ApiRequest[TemperatueZoneStatus] =
    ApiRequest[TemperatueZoneStatus](ApiMethods.GET, "https://virtserver.swaggerhub.com/ZachT1711/Zach/1.0.0", "/temperature/{zoneId}", "application/json")
      .withPathParam("zoneId", zoneId)
      .withSuccessResponse[TemperatueZoneStatus](200)
        /**
   * turns the heater on or off
   * 
   * Expected answers:
   *   code 200 : ApiResponse (Status of the operation)
   * 
   * @param zoneId 
   * @param state 
   */
  def setHeaterState(zoneId: String, state: String): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "https://virtserver.swaggerhub.com/ZachT1711/Zach/1.0.0", "/temperature/{zoneId}/heater/{state}", "application/json")
      .withPathParam("zoneId", zoneId)
      .withPathParam("state", state)
      .withSuccessResponse[ApiResponse](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : TemperatureSummary (ok)
   */
  def temperatureSummary(): ApiRequest[TemperatureSummary] =
    ApiRequest[TemperatureSummary](ApiMethods.GET, "https://virtserver.swaggerhub.com/ZachT1711/Zach/1.0.0", "/temperature", "application/json")
      .withSuccessResponse[TemperatureSummary](200)
      

}

