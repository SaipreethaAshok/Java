package org.tnsif.c2tc.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="user")
public class User {
	@Id
private long id;
private String name;
private String password;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
