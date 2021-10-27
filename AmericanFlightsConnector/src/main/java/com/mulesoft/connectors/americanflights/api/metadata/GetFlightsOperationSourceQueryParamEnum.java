package com.mulesoft.connectors.americanflights.api.metadata;

public enum GetFlightsOperationSourceQueryParamEnum {
  SFO("SFO"),

  LAX("LAX"),

  SJC("SJC");

  private String value;

  GetFlightsOperationSourceQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
