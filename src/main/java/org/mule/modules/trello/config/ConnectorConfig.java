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
	@Default("9338edc094283fd8e41a086bad98aaf9")
	private String apiKey = "9338edc094283fd8e41a086bad98aaf9";
	
	@Configurable
	@Optional
	@Default("0258c4b0087dab8e1197198e58890090eda3b85be5a3baa1038de4bff114037a")
	private String apiToken = "0258c4b0087dab8e1197198e58890090eda3b85be5a3baa1038de4bff114037a";
	
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
