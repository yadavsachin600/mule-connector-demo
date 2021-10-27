package com.mulesoft.connectors.americanflights.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class GetFlightsOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/get-flights-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "get-flights-type-resolver";
  }
}
