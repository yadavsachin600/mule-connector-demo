package com.mulesoft.connectors.americanflights.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes;
import com.mulesoft.connectivity.rest.commons.api.operation.NonEntityRequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
import java.io.InputStream;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;
import org.mule.runtime.http.api.HttpConstants;

public class DeleteFlightsIdOperation extends BaseRestOperation {
  private static final String OPERATION_PATH = "/flights/{ID}";

  private static final RestRequestBuilder.QueryParamFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.QueryParamFormat.MULTIMAP;

  public DeleteFlightsIdOperation() {}

  /**
   * Delete an imaginary flight from American Flights Airline
   *
   * <p>This operation makes an HTTP DELETE request to the /flights/{ID} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param idUriParam ID
   * @param clientIdHeader Client ID
   * @param clientSecretHeader Client Secret
   * @param parameters the {@link NonEntityRequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Delete a Flight")
  @Summary("Delete an imaginary flight from American Flights Airline")
  @MediaType("application/json")
  public void deleteFlightsId(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("ID") String idUriParam,
      @DisplayName("Client id") @Summary("Client ID") String clientIdHeader,
      @DisplayName("Client secret") @Summary("Client Secret") String clientSecretHeader,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) NonEntityRequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, HttpResponseAttributes> callback) {
    RestRequestBuilder builder =
        new RestRequestBuilder(
                connection.getBaseUri(), OPERATION_PATH, HttpConstants.Method.DELETE, parameters)
            .setQueryParamFormat(QUERY_PARAM_FORMAT)
            .addHeader("accept", "application/json")
            .addUriParam("ID", idUriParam)
            .addHeader("client_id", clientIdHeader)
            .addHeader("client_secret", clientSecretHeader);
    doRequest(
        config,
        connection,
        builder,
        overrides.getResponseTimeoutAsMillis(),
        streamingHelper,
        callback);
  }
}
