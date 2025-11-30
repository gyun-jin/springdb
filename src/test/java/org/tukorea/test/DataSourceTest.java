package org.tukorea.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tukorea.jdbc.config.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class DataSourceTest {
	@Autowired
	private DataSource ds;

	private static Logger logger = LoggerFactory.getLogger(DataSourceTest.class);

	@Test
	public void testConnection() throws Exception {
		try (Connection con = ds.getConnection()) {
			logger.info("con.toString() : " + con.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDataSourceNotNull() {
		assertNotNull(ds);
	}

	@Test
	public void testGetConnection() throws Exception {
		try (Connection con = ds.getConnection()) {
			assertNotNull(con);
			assertFalse(con.isClosed());
		}
	}

	 @Test
	    public void testMultipleConnections() throws Exception {
	        Connection c1 = ds.getConnection();
	        Connection c2 = ds.getConnection();
	        Connection c3 = ds.getConnection();

	        assertNotNull(c1);
	        assertNotNull(c2);
	        assertNotNull(c3);

	        c1.close();
	        c2.close();
	        c3.close();
	    }
}
