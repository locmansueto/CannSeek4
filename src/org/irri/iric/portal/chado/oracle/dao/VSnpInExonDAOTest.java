package org.irri.iric.portal.chado.oracle.dao;

import org.irri.iric.portal.chado.oracle.domain.VSnpInExon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class used to test the basic Data Store Functionality
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = { "file:./resources/iric_prod_crud-security-context.xml",
		"file:./resources/iric_prod_crud-service-context.xml", "file:./resources/iric_prod_crud-dao-context.xml",
		"file:./resources/iric_prod_crud-web-context.xml" })
public class VSnpInExonDAOTest {
	/**
	 * The DAO being tested, injected by Spring
	 *
	 */
	private VSnpInExonDAO dataStore;

	/**
	 * Instantiates a new VSnpInExonDAOTest.
	 *
	 */
	public VSnpInExonDAOTest() {
	}

	/**
	 * Method to test VSnpInExon domain object.
	 *
	 */
	@Rollback(false)
	@Test
	public void VSnpInExon() {
		VSnpInExon instance = new VSnpInExon();

		// Test create
		// TODO: Populate instance for create. The store will fail if the primary key
		// fields are blank.

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested
	 *
	 */
	@Autowired
	public void setDataStore(VSnpInExonDAO dataStore) {
		this.dataStore = dataStore;
	}
}
