package com.nt.nb;

public class NetBankingService {
	public String transfermoney(long srcAcc,long desAcc,String ifsc,double amt) {
		//customer money transfer details
		return amt+"money transfer from "+srcAcc+"to "+desAcc;
	}
}
