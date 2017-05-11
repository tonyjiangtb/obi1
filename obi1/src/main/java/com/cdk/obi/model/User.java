package com.cdk.obi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	public String UserID;
	public String  desc;
	public String  mode;
	public String  pass;
	public String  accessurl;
	public String  active;
	public String  expire;
}
