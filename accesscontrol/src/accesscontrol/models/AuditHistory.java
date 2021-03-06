package accesscontrol.models;

import java.util.Date;

public class AuditHistory {

	private String url;
	private String userId;
	private boolean isGranted;
	private Date createdOn;

	public AuditHistory(String url, String userId, boolean isGranted, Date createdOn) {
		super();
		this.url = url;
		this.userId = userId;
		this.isGranted = isGranted;
		this.createdOn = createdOn;
	}

	public String getUrl() {
		return url;
	}

	public String getUserId() {
		return userId;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public boolean isGranted() {
		return isGranted;
	}

	@Override
	public String toString() {
		return "AuditHistory [url=" + url + ", userId=" + userId + ", isGranted=" + isGranted + ", createdOn="
				+ createdOn + "]";
	}

}
