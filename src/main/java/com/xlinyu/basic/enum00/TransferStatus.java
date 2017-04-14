package com.xlinyu.basic.enum00;


public enum TransferStatus {

	WAITTING_FREEZE("待扣款"),
	WAITTING_REMIT("待打款"),
	WAITTING_WITHHOLD("待扣款"),
	SUCCESS("转账成功");
	
	private TransferStatus(String message) {
	}
	
	public static TransferStatus getName(String name){
		for (TransferStatus status : TransferStatus.values()) {
            if (status.name().equals(name)) {
                return status;
            }
        }
        return null;
	}
	
	public static void main(String[] args) {
		TransferStatus name = TransferStatus.getName("SUCCESS");
		System.out.println(name);
	}
}
