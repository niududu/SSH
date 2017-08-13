package com.neusoft.test;

import org.hibernate.cfg.Configuration;

import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);
	}

}
