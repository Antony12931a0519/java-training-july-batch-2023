package test;

import java.util.Scanner;

public class PriceCalculator {

	/*
	 * PRICE DETAILS MRP (1 item) ₹265 Product Discount − ₹128 Delivery Fee ₹50
	 * Total Amount ₹187
	 */

	float mrpPrice;
	float discountedPrice;
	float delieveryFee;
	float totalAmount;

	public static void main(String[] args) {

		PriceCalculator priceCalculator = new PriceCalculator();

		System.out.println("Price Details:");
		System.out.println("Enter the MRP Price of the product:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		priceCalculator.mrpPrice = scanner.nextFloat();

		if (priceCalculator.mrpPrice > 0 && priceCalculator.mrpPrice < 1000) {
			priceCalculator.discountedPrice = (priceCalculator.mrpPrice / 100);
			priceCalculator.discountedPrice = priceCalculator.discountedPrice * 10;
		}

		System.out.println(
				"Price details after the dsicount:" + (priceCalculator.mrpPrice - priceCalculator.discountedPrice));

		if (priceCalculator.mrpPrice > 0 && priceCalculator.mrpPrice <= 499) {
			priceCalculator.delieveryFee = 40;

		}

		System.out.println("Delivery Fee :" + priceCalculator.delieveryFee);

		System.out.println("Total Amount to be paid is: "
				+ (priceCalculator.mrpPrice - priceCalculator.discountedPrice + priceCalculator.delieveryFee));

	}

}
