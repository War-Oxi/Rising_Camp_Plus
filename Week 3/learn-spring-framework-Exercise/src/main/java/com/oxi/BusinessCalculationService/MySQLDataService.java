package com.oxi.BusinessCalculationService;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}
}
