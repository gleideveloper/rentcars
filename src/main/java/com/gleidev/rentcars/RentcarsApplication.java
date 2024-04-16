package com.gleidev.rentcars;

import com.gleidev.rentcars.model.entity.CarRental;
import com.gleidev.rentcars.model.entity.Vehicle;
import com.gleidev.rentcars.service.MessagingService;
import com.gleidev.rentcars.service.Payment;
import com.gleidev.rentcars.service.RentalService;
import com.gleidev.rentcars.service.ServiceLocator;
import com.gleidev.rentcars.service.impl.PaymentBasicImpl;
import com.gleidev.rentcars.service.impl.PaymentDiscountImpl;
import com.gleidev.rentcars.service.impl.TaxUSAServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

@EnableKafka
@SpringBootApplication
public class RentcarsApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(RentcarsApplication.class, args);

		MessagingService service = ServiceLocator.getService("EmailService");
		String email = service.getMessageBody();

		MessagingService smsService = ServiceLocator.getService("SMSService");
		String sms = smsService.getMessageBody();

		MessagingService emailService = ServiceLocator.getService("EmailService");
		String newEmail = emailService.getMessageBody();

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
