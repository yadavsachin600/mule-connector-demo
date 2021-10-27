package com.mulesoft.connectors.americanflights.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;

public class PutFlightsIdInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/post-flights-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "put-flights-id-type-resolver";
  }
}
