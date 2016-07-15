/**
 *
 */
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class BoardsByIdGetResponse.
 */
public class BoardsByIdGetResponse extends StatusResponse {
	 
	 /** The label names. */
 	private LabelNames labelNames;

	    /** The id. */
    	private String id;

	    /** The prefs. */
    	private Prefs prefs;

	    /** The id organization. */
    	private String idOrganization;

	    /** The desc. */
    	private String desc;

	    /** The desc data. */
    	private DescData descData;

	    /** The pinned. */
    	private String pinned;

	    /** The name. */
    	private String name;

	    /** The short url. */
    	private String shortUrl;

	    /** The closed. */
    	private String closed;

	    /** The url. */
    	private String url;

		/**
		 * Gets the label names.
		 *
		 * @return the label names
		 */
		public LabelNames getLabelNames() {
			return labelNames;
		}

		/**
		 * Sets the label names.
		 *
		 * @param labelNames the new label names
		 */
		public void setLabelNames(LabelNames labelNames) {
			this.labelNames = labelNames;
		}

		/**
		 * Gets the id.
		 *
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * Sets the id.
		 *
		 * @param id the new id
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * Gets the prefs.
		 *
		 * @return the prefs
		 */
		public Prefs getPrefs() {
			return prefs;
		}

		/**
		 * Sets the prefs.
		 *
		 * @param prefs the new prefs
		 */
		public void setPrefs(Prefs prefs) {
			this.prefs = prefs;
		}

		/**
		 * Gets the id organization.
		 *
		 * @return the id organization
		 */
		public String getIdOrganization() {
			return idOrganization;
		}

		/**
		 * Sets the id organization.
		 *
		 * @param idOrganization the new id organization
		 */
		public void setIdOrganization(String idOrganization) {
			this.idOrganization = idOrganization;
		}

		/**
		 * Gets the desc.
		 *
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

		/**
		 * Sets the desc.
		 *
		 * @param desc the new desc
		 */
		public void setDesc(String desc) {
			this.desc = desc;
		}

		/**
		 * Gets the desc data.
		 *
		 * @return the desc data
		 */
		public DescData getDescData() {
			return descData;
		}

		/**
		 * Sets the desc data.
		 *
		 * @param descData the new desc data
		 */
		public void setDescData(DescData descData) {
			this.descData = descData;
		}

		/**
		 * Gets the pinned.
		 *
		 * @return the pinned
		 */
		public String getPinned() {
			return pinned;
		}

		/**
		 * Sets the pinned.
		 *
		 * @param pinned the new pinned
		 */
		public void setPinned(String pinned) {
			this.pinned = pinned;
		}

		/**
		 * Gets the name.
		 *
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Sets the name.
		 *
		 * @param name the new name
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * Gets the short url.
		 *
		 * @return the short url
		 */
		public String getShortUrl() {
			return shortUrl;
		}

		/**
		 * Sets the short url.
		 *
		 * @param shortUrl the new short url
		 */
		public void setShortUrl(String shortUrl) {
			this.shortUrl = shortUrl;
		}

		/**
		 * Gets the closed.
		 *
		 * @return the closed
		 */
		public String getClosed() {
			return closed;
		}

		/**
		 * Sets the closed.
		 *
		 * @param closed the new closed
		 */
		public void setClosed(String closed) {
			this.closed = closed;
		}

		/**
		 * Gets the url.
		 *
		 * @return the url
		 */
		public String getUrl() {
			return url;
		}

		/**
		 * Sets the url.
		 *
		 * @param url the new url
		 */
		public void setUrl(String url) {
			this.url = url;
		}

}
