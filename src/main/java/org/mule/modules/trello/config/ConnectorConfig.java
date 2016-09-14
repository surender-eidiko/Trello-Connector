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
	//private String url = "http://localhost:8090/1";

	/*@Configurable
	@Optional
	@RestHeaderParam("Authorization")
	private String authorization = "Token token=718d02b66df73ad7a6537296ea9ba96adc18873a3a00ada8796dc1685cf29e1a";
*/
	/*@Configurable
	@Optional
	@Default("9338edc094283fd8e41a086bad98aaf9")
	private String apiKey = "9338edc094283fd8e41a086bad98aaf9";
	
	@Configurable
	@Optional
	@Default("0e02fc680f9b4d81a5795773e9e5dfda97d44d1886718a9c9bdbd60691a22a0a")
	private String apiToken = "0e02fc680f9b4d81a5795773e9e5dfda97d44d1886718a9c9bdbd60691a22a0a";
	*/
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

/*	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}*/

	
}
