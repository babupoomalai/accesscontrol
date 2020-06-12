package accesscontrol.service;

import java.util.Date;

import accesscontrol.models.AuditHistory;

public class AuditService {

	public AuditHistory auditRequest(String page, String userId, boolean isRestricted) {
		return new AuditHistory(page, userId, !isRestricted, new Date());
	}

}
