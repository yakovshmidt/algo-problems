package kz.home.ys.algo.google.easy.licenseKeyFormatting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LicenseKeyFormattingTest {

    @Test
    public void testLicenseKeyFormatting() {
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();

        assertEquals("2-5G-3J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
        assertEquals("5F3Z-2E9W", licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}