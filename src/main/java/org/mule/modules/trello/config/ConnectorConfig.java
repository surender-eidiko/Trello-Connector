/**
 *
 */
package org.mule.modules.trello.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	@Configurable
	@Optional
	@Default("https://api.trello.com/1")
	private String url = "https://api.trello.com/1";

	
	@Configurable
	@Optional
	@Default("d241182640252f708e19d236f3f72b26")
	private String apiKey = "d241182640252f708e19d236f3f72b26";
	
	@Configurable
	@Optional
	@Default("32b320d36043e42db2e849ed232a6373ddf8ff3d4fd870594e7f04126db47511")
	private String apiToken = "32b320d36043e42db2e849ed232a6373ddf8ff3d4fd870594e7f04126db47511";
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getApiToken() {
		return apiToken;
	}

	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}

	
}
