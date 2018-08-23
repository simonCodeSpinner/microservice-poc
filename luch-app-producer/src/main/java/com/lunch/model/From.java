package com.lunch.model;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class From
{

	@Nullable
	private String name;


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
