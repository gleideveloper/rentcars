package com.gleidev.rentcars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

import java.text.ParseException;

@EnableKafka
@SpringBootApplication
public class RentcarsApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(RentcarsApplication.class, args);

		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		Date finish = sdf.parse(sc.nextLine());

		var vehice = new Vehicle(carModel);
		var cr = new CarRental(start, finish, vehice);

		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();

		System.out.print("Is BlackFriday? ");
		int isBlackFriday = sc.nextInt();

		Payment payment;
		if(isBlackFriday > 0) {
			payment = new PaymentDiscountImpl(pricePerHour, pricePerDay);
		}else{
			payment = new PaymentBasicImpl(pricePerHour, pricePerDay);
		}
		var rentalService = new RentalService(payment, new TaxUSAServiceImpl());
		rentalService.processInoive(cr);

		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Amount payment: " + String.format("%.2f", cr.getInvoice().getAmountPayment()));

		sc.close();*/
	}

}
