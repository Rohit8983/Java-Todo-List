package beans;

import java.util.Objects;

public class tasks {
	
	private int taskid;
	private String taskName;
	private String taskDate;
	private int taskStatus;
	private int taskregid;
	public tasks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tasks(int taskid, String taskName, String taskDate, int taskStatus, int taskregid) {
		super();
		this.taskid = taskid;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.taskStatus = taskStatus;
		this.taskregid = taskregid;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	public int getTaskregid() {
		return taskregid;
	}
	public void setTaskregid(int taskregid) {
		this.taskregid = taskregid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(taskDate, taskName, taskStatus, taskid, taskregid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tasks other = (tasks) obj;
		return Objects.equals(taskDate, other.taskDate) && Objects.equals(taskName, other.taskName)
				&& taskStatus == other.taskStatus && taskid == other.taskid && taskregid == other.taskregid;
	}
	@Override
	public String toString() {
		return "tasks [taskid=" + taskid + ", taskName=" + taskName + ", taskDate=" + taskDate + ", taskStatus="
				+ taskStatus + ", taskregid=" + taskregid + "]";
	}
	
	

}
