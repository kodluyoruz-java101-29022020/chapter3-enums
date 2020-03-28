package chapter3.enums;

public class Main {

	public static void main(String[] args) {
		
		
		PaymentStatus[] paymentStatusList = PaymentStatus.values();
		
		for(PaymentStatus paymentStatus : paymentStatusList) {
			
			StringBuilder builder = new StringBuilder();
			builder.append("[Code: ");
			builder.append(paymentStatus.getCode());
			builder.append(" - ");
			builder.append("Description: ");
			builder.append(paymentStatus.getDescription());
			builder.append("]");
			
			System.out.println(builder.toString());
		}
	}

}
