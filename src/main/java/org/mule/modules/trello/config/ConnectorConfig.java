/**
 *
 */
package org.mule.modules.trello.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.rest.RestHeaderParam;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	@Configurable
	@Optional
	@Default("https://api.trello.com/1")
	private String url = "https://api.trello.com/1";

	/*@Configurable
	@Optional
	@RestHeaderParam("Authorization")
	private String authorization = "Token token=718d02b66df73ad7a6537296ea9ba96adc18873a3a00ada8796dc1685cf29e1a";
*/
	@Configurable
	@Optional
	@Default("d241182640252f708e19d236f3f72b26")
	private String apiKey = "d241182640252f708e19d236f3f72b26";
	
	@Configurable
	@Optional
	@Default("a1e6efaacbd06b770a8fa76e1be5706f2f117e921070b33eca308f3bfca7fefd")
	private String apiToken = "a1e6efaacbd06b770a8fa76e1be5706f2f117e921070b33eca308f3bfca7fefd";
	
	
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
