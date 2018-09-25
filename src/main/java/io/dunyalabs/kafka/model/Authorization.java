package io.dunyalabs.kafka.model;

public class Authorization {
	private String actor;
	private String permission;

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Authorization() {
		super();
		// TODO Auto-generated constructor stub
	}

}
