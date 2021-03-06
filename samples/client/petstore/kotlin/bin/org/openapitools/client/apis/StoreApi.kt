/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.Order

import org.openapitools.client.infrastructure.*

class StoreApi(basePath: kotlin.String = "http://petstore.swagger.io/v2") : ApiClient(basePath) {

    /**
    * Delete purchase order by ID
    * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
    * @param orderId ID of the order that needs to be deleted 
    * @return void
    */
    fun deleteOrder(orderId: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/store/order/{orderId}".replace("{"+"orderId"+"}", "$orderId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Returns pet inventories by status
    * Returns a map of status codes to quantities
    * @return kotlin.collections.Map<kotlin.String, kotlin.Int>
    */
    @Suppress("UNCHECKED_CAST")
    fun getInventory() : kotlin.collections.Map<kotlin.String, kotlin.Int> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/store/inventory",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.collections.Map<kotlin.String, kotlin.Int>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.collections.Map<kotlin.String, kotlin.Int>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Find purchase order by ID
    * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
    * @param orderId ID of pet that needs to be fetched 
    * @return Order
    */
    @Suppress("UNCHECKED_CAST")
    fun getOrderById(orderId: kotlin.Long) : Order {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/store/order/{orderId}".replace("{"+"orderId"+"}", "$orderId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Order>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Order
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Place an order for a pet
    * 
    * @param body order placed for purchasing the pet 
    * @return Order
    */
    @Suppress("UNCHECKED_CAST")
    fun placeOrder(body: Order) : Order {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/store/order",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Order>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Order
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
