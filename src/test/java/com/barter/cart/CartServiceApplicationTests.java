package com.barter.cart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartServiceApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(CartServiceApplicationTests.class);

	@Autowired
	private DataSource dataSource;

	@Test
	public void contextLoads() {
		logger.info(dataSource.toString());
		if (dataSource.toString().contains("HikariDataSource")) {
			logger.info("*****************valid data source assigned*****************");
			try {
				dataSource.getConnection().createStatement().execute("select 1");
				fail();
			} catch (SQLException e) {
				logger.error("*****************valid data source assigned*****************");
				logger.error(e.getMessage(), e);
				fail();
			}
		} else {
			logger.error("*****************invalid data source assigned*****************");
			fail();
		}
	}
}
