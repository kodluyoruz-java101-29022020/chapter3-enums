package chapter3.enums;

public class Main {

	public static void main(String[] args) {
		
		
		PaymentStatus success = PaymentStatus.SUCCESS;
		PaymentStatus fail =  PaymentStatus.FAIL;
		
		
		PaymentStatus[] paymentStatusList = PaymentStatus.values();
		
		for(PaymentStatus paymentStatus : paymentStatusList) {
			
			StringBuilder builder = new StringBuilder();
			builder.append("[Code: ");
			builder.append(paymentStatus.getCode());
			builder.append(" - ");
			builder.append("Description: ");
			builder.append(paymentStatus.getDescription());
			builder.append(" - ");
			builder.append("Name: ");
			builder.append(paymentStatus.name());
			builder.append(" - ");
			builder.append("Ordinal: ");
			builder.append(paymentStatus.ordinal());
			builder.append("]");
			
			System.out.println(builder.toString());
		}
	}

}
