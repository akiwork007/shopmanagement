package com.fs.shopmanagement.doa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.fs.shopmanagement.common.ErrorConstants;
import com.fs.shopmanagement.doa.domain.CustomerEntity;
import com.fs.shopmanagement.exception.NoDataFountException;

/**
 * @author Life
 */
@Repository("getCustomerDetailsDAOImpl")
@Transactional
public class CustomerDetailsDAOImpl implements CustomerDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(readOnly = true)
	public List<CustomerEntity> getCustomerDetails(CustomerEntity request) throws NoDataFountException {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(CustomerEntity.class);

		if (0 < request.getCustomerId())
			criteria.add(Restrictions.eqOrIsNull("customerId", request.getCustomerId()));
		if (!StringUtils.isEmpty(request.getFirstName()))
			criteria.add(Restrictions.eqOrIsNull("firstName", request.getFirstName()));
		if (!StringUtils.isEmpty(request.getLastName()))
			criteria.add(Restrictions.eqOrIsNull("lastName", request.getLastName()));
		if (!StringUtils.isEmpty(request.getMiddleName()))
			criteria.add(Restrictions.eqOrIsNull("middleName", request.getMiddleName()));
		if (0 < request.getAge())
			criteria.add(Restrictions.eqOrIsNull("age", request.getAge()));
		if (!StringUtils.isEmpty(request.getPhoneNumber()))
			criteria.add(Restrictions.eqOrIsNull("phoneNumber", request.getPhoneNumber()));
		if (!StringUtils.isEmpty(request.getSex()))
			criteria.add(Restrictions.eqOrIsNull("sex", request.getSex()));

		List<CustomerEntity> response = (List<CustomerEntity>) criteria.list();
		if (null == response)
			throw new NoDataFountException(ErrorConstants.CUSTOMER_NOT_FOUND_CODE,
					ErrorConstants.CUSTOMER_NOT_FOUND_MSG);
		return response;
	}

	@Override
	public CustomerEntity addCustomerDetails(CustomerEntity request) {
		Session session = entityManager.unwrap(Session.class);
		int id = (int) session.save(request);
		request.setCustomerId(id);
		return request;
	}

	@Override
	public CustomerEntity updateCustomerDetails(CustomerEntity request) {
		Session session = entityManager.unwrap(Session.class);
		session.update(request);
		return request;
	}
}
