package com.mulesoft.connectors.americanflights.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class PostFlightsOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/post-flights-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "post-flights-type-resolver";
  }
}
