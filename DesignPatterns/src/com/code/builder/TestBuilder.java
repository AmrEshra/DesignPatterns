package com.code.builder;

public class TestBuilder {

	public static void main(String[] args){
		
		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";
		
		QueryBuilder sql = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, sql);
		query.execute();

		QueryBuilder mongo = new MongoDbQueryBuilder();
		query = director.buildQuery(from, where, mongo);
		query.execute();

	}
	
}
