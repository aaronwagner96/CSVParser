package de.aaronwagner.dev.type;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ZipCodeTest {

    String validZipCode = "45663";
    String invalidZipCode1 = "";
    String invalidZipCode2 = "4566";
    String invalidZipCode3 = "ESSEN";

    public void testValidZipCode() {
        ZipCode postleitzahl = new ZipCode();
        Assert.assertTrue(postleitzahl.setZip(validZipCode));
    }

    public void testInvalidEmptyZipCode() {
        ZipCode postleitzahl = new ZipCode();
        Assert.assertFalse(postleitzahl.setZip(invalidZipCode1));
    }

    public void testInvalidShortZipCode() {
        ZipCode postleitzahl = new ZipCode();
        Assert.assertFalse(postleitzahl.setZip(invalidZipCode2));
    }

    public void testInvalidAlphanumericZipCode() {
        ZipCode postleitzahl = new ZipCode();
        Assert.assertFalse(postleitzahl.setZip(invalidZipCode3));
    }

}
