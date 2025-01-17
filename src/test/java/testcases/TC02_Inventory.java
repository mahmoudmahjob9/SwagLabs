package testcases;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import pages.*;

import javax.swing.*;
import java.util.*;


import static drivers.DriverHolder.getDriver;

import static util.Utility.*;

public class TC02_Inventory extends TestBase{


    int numberOfProducts =generateRandomNumber(6);


    String firstName =generateRandomName(10);
    String lastName =generateRandomName(10);
    String postalCode = String.valueOf(generateRandomNumber(9999));


    @Test(priority = 1,description = " Add ToCard ")
    public void addToCard_P() throws InterruptedException {
        //login
        new P01_LoginPage(getDriver()).enterUsername(username).enterPassword(password).clickLoginButton();

        //inventory

        int max = 6; // Set the maximum value for random numbers
        int randomNum = generateRandomNumber(max); // Generate a random number for the loop count

        System.out.println("Generated Random Number: " + randomNum);

        // Call the method to generate unique random numbers and save them in a list
        ArrayList<Integer> uniqueNumbers = generateUniqueRandomNumbers(max, randomNum);

        // Print the entire list of unique random numbers
        System.out.println("Unique Random Numbers: " + uniqueNumbers);

        // Pass the unique random numbers one by one
        System.out.println("Processing unique random numbers one by one:");
        double  totalprice=0;
        for (int number : uniqueNumbers) {

            Thread.sleep(1000);
            System.out.println("Processing number: " + number);
            //new P02_Inventory(getDriver()).clickAddToCardButton(number);

            Thread.sleep(1000);
            new P02_Inventory(getDriver()).clickAddToCardButton(number-1);
         double priceitem =    new P02_Inventory(getDriver()).getPrice(number-1);

         totalprice +=priceitem;



            // Add any specific operation you want to perform with the number here
        }
        totalprice =Math.round(totalprice * 100.0) / 100.0 ;
        System.out.println("totalprice" + totalprice);



        Thread.sleep(3000);
        new P02_Inventory(getDriver()).clickShoppingCardButton();


        //Cart
         new P03_Cart(getDriver()).clickOnCheckoutButton();

        //chectout1

        new P04_CheckoutPage(getDriver()).enterFirstName(firstName)
        .enterLastName(lastName)
                .enterPostalCode(postalCode)
        .clickOnContinue();

        //Chechout2

        double pricetotal = new P05_CheckoutStep2(getDriver()).gettextofTotal_Price();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(pricetotal,totalprice, "Rounded value does not match expected");
        softAssert.assertAll();



        new P05_CheckoutStep2(getDriver()).clickOnFinish();

        Thread.sleep(3000);
        //Assert.assertEquals("THANK YOU FOR YOUR ORDER", );
       Assert.assertTrue(getDriver().getPageSource().contains("THANK YOU FOR YOUR ORDER"));
        Thread.sleep(3000);
        System.out.println(getDriver().getCurrentUrl());

    }

}
