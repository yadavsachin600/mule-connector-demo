package com.mulesoft.connectors.americanflights.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class GetFlightsIdOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/post-flights-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "get-flights-id-type-resolver";
  }
}
