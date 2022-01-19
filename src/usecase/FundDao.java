package usecase;

import java.math.BigDecimal;
import java.util.List;

public interface FundDao {

	List<Fund> findFund(String accNumber) throws Exception;

	void updateFund(BigDecimal saiBalAmount, long accNumber) throws Exception;
	
	

}
