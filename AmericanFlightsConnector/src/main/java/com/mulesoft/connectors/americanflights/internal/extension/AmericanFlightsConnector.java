package com.mulesoft.connectors.americanflights.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.americanflights.internal.config.AmericanFlightsConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "American Flights Connector")
@Xml(prefix = "american-flights")
@Configurations({AmericanFlightsConfiguration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class AmericanFlightsConnector {}
