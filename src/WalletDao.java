package jdbc_workspace;

public interface WalletDao {
	
	public abstract void findWallet() throws Exception;
	
	public abstract int saveWallet() throws Exception;
	
	public abstract int updateWallet() throws Exception;
	
	public abstract int deleteWallet() throws Exception;
	
	
	
}
