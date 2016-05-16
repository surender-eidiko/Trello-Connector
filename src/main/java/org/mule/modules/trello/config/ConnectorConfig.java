/**
 *
 */
package org.mule.modules.trello.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	@Configurable
	@Optional
	@Default("https://api.trello.com/1")
	private String url = "https://api.trello.com/1";

	/*@Configurable
	@Optional
	@RestHeaderParam("Authorization")
	private String authorization = "Bearer NmM0Y2FjMTUtYTJmYy00MThjLWFhYzYtYzA0YmYxOTQwNjk5YjA2MDllMjItMTg1";
*/
	@Configurable
	@Optional
	@Default("ab7870583126b41b7c4b83710f5d5878")
	private String apiKey = "ab7870583126b41b7c4b83710f5d5878";
	
	@Configurable
	@Optional
	@Default("fe55b93d55318ea435c5ca6f597da1e52285d56ef7a837119adc41057dda3254")
	private String apiToken = "fe55b93d55318ea435c5ca6f597da1e52285d56ef7a837119adc41057dda3254";
	
	
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

/*	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}*/

	
}
