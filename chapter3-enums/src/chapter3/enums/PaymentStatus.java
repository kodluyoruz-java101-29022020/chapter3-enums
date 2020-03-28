package chapter3.enums;

public enum PaymentStatus {

	SUCCESS("200", "İşlem başarılıdır."), 
	PROVISION("202", "İşlem bankada askıda beklemektedir."), 
	FAIL("500", "İşlem başarısızdır.");
	
	
	// değişkenler
	private final String code;
	private final String description;
	
	// kurucu metot,
	// enum kurucuları private olmalıdır.
	private PaymentStatus(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	
	// metotlar
	public String getCode() {
		return this.code;
	}
	
	public String getDescription() {
		return this.description;
	}
}
