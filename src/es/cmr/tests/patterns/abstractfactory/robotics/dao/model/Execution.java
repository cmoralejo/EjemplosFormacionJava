/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao.model;

import java.util.Date;

/**
 * @author Carlos
 *
 */
public class Execution {
	
	public enum STATUS {
		//TODO meter resto de estados
		RUNNING(1);
		
		private int idStatus;

		private STATUS(int idStatus) {
			this.setIdStatus(idStatus);
		}

		public int getIdStatus() {
			return idStatus;
		}

		public void setIdStatus(int idStatus) {
			this.idStatus = idStatus;
		}
		
	}	
	
	public enum TIME_UNIT {
		HOUR("hh"),MINUTE("mi"),SECOND("ss");
		
		private String name;

		private TIME_UNIT(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
	}


	private String id; 
	private Date timeLastlog; 
	private String idInternal; 
	private Date startTime; 
	private String startParamsXml; 
	private Date endTime;
	private String processId; 
	private String processName; 
	private String vdiStarterId; 
	private String vdiStarterName; 
	private String userStarterId; 
	private String userStarterName;
	private String vdiRunningId;
	private String vdiRunningName;
	private String userRunningName;
	private int statusId;
	private String statusName; 
	private String loggingLevelsXml; 
	private String sessionStateXml; 
	private String queueId;

	
	protected String getId() {
		return(id);
	}


	protected void setId(String id) {
		this.id = id;
	}


	protected Date getTimeLastlog() {
		return timeLastlog;
	}


	protected void setTimeLastlog(Date timeLastlog) {
		this.timeLastlog = timeLastlog;
	}


	protected String getIdInternal() {
		return idInternal;
	}


	protected void setIdInternal(String idInternal) {
		this.idInternal = idInternal;
	}


	protected Date getStartTime() {
		return startTime;
	}


	protected void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	protected String getStartParamsXml() {
		return startParamsXml;
	}


	protected void setStartParamsXml(String startParamsXml) {
		this.startParamsXml = startParamsXml;
	}


	protected Date getEndTime() {
		return endTime;
	}


	protected void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	protected String getProcessId() {
		return processId;
	}


	protected void setProcessId(String processId) {
		this.processId = processId;
	}


	protected String getProcessName() {
		return processName;
	}


	protected void setProcessName(String processName) {
		this.processName = processName;
	}


	protected String getVdiStarterId() {
		return vdiStarterId;
	}


	protected void setVdiStarterId(String vdiStarterId) {
		this.vdiStarterId = vdiStarterId;
	}


	protected String getVdiStarterName() {
		return vdiStarterName;
	}


	protected void setVdiStarterName(String vdiStarterName) {
		this.vdiStarterName = vdiStarterName;
	}


	protected String getUserStarterId() {
		return userStarterId;
	}


	protected void setUserStarterId(String userStarterId) {
		this.userStarterId = userStarterId;
	}


	protected String getUserStarterName() {
		return userStarterName;
	}


	protected void setUserStarterName(String userStarterName) {
		this.userStarterName = userStarterName;
	}


	protected String getVdiRunningId() {
		return vdiRunningId;
	}


	protected void setVdiRunningId(String vdiRunningId) {
		this.vdiRunningId = vdiRunningId;
	}


	protected String getVdiRunningName() {
		return vdiRunningName;
	}


	protected void setVdiRunningName(String vdiRunningName) {
		this.vdiRunningName = vdiRunningName;
	}


	protected String getUserRunningName() {
		return userRunningName;
	}


	protected void setUserRunningName(String userRunningName) {
		this.userRunningName = userRunningName;
	}


	protected int getStatusId() {
		return statusId;
	}


	protected void setStatusId(int statusId) {
		this.statusId = statusId;
	}


	protected String getStatusName() {
		return statusName;
	}


	protected void setStatusName(String statusName) {
		this.statusName = statusName;
	}


	protected String getLoggingLevelsXml() {
		return loggingLevelsXml;
	}


	protected void setLoggingLevelsXml(String loggingLevelsXml) {
		this.loggingLevelsXml = loggingLevelsXml;
	}


	protected String getSessionStateXml() {
		return sessionStateXml;
	}


	protected void setSessionStateXml(String sessionStateXml) {
		this.sessionStateXml = sessionStateXml;
	}


	protected String getQueueId() {
		return queueId;
	}


	protected void setQueueId(String queueId) {
		this.queueId = queueId;
	}


	@Override
	public String toString() {
		return "Execution [id=" + id + ", timeLastlog=" + timeLastlog + ", idInternal=" + idInternal + ", startTime="
				+ startTime + ", startParamsXml=" + startParamsXml + ", endTime=" + endTime + ", processId=" + processId
				+ ", processName=" + processName + ", vdiStarterId=" + vdiStarterId + ", vdiStarterName="
				+ vdiStarterName + ", userStarterId=" + userStarterId + ", userStarterName=" + userStarterName
				+ ", vdiRunningId=" + vdiRunningId + ", vdiRunningName=" + vdiRunningName + ", userRunningName="
				+ userRunningName + ", statusId=" + statusId + ", statusName=" + statusName + ", loggingLevelsXml="
				+ loggingLevelsXml + ", sessionStateXml=" + sessionStateXml + ", queueId=" + queueId + "]";
	}


	/**
	 * 
	 */
	public Execution() {
		// TODO Auto-generated constructor stub
	}

}
