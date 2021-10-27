package com.mulesoft.connectors.americanflights.internal.config;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectors.americanflights.internal.connection.provider.UnsecuredConnectionProvider;
import com.mulesoft.connectors.americanflights.internal.operation.DeleteFlightsIdOperation;
import com.mulesoft.connectors.americanflights.internal.operation.GetFlightsIdOperation;
import com.mulesoft.connectors.americanflights.internal.operation.GetFlightsOperation;
import com.mulesoft.connectors.americanflights.internal.operation.PostFlightsOperation;
import com.mulesoft.connectors.americanflights.internal.operation.PutFlightsIdOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({
  GetFlightsOperation.class,
  PostFlightsOperation.class,
  GetFlightsIdOperation.class,
  DeleteFlightsIdOperation.class,
  PutFlightsIdOperation.class
})
@ConnectionProviders({UnsecuredConnectionProvider.class})
public class AmericanFlightsConfiguration extends RestConfiguration {}
