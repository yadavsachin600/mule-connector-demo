package com.mulesoft.connectors.americanflights.api.metadata;

public enum GetFlightsOperationDestinationQueryParamEnum {
  SFO("SFO"),

  LAX("LAX"),

  SJC("SJC");

  private String value;

  GetFlightsOperationDestinationQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
