package josecoelho.com.robolectricreproducegeocoderissue;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class GeocoderReproducingNPE {
    @Test
    public void reproduceNPEWithGeocoder() throws IOException {
        Location location = new Location("test");
        location.setLatitude(12.34);
        location.setLongitude(23.45);

        Geocoder geocoder = new Geocoder(RuntimeEnvironment.application.getApplicationContext(), Locale.getDefault());
        List<Address> geocodeResults = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);

        assertTrue(true);
    }
}