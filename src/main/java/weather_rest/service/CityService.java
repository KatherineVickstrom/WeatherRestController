package weather_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weather_rest.domain.*;
 
@Service
public class CityService {
        @Autowired
        private CityRepository cityRepository;
        @Autowired
        private CountryRepository countryRepository;
        @Autowired
        private WeatherService weatherService;
        
        public CityInfo getCityInfo(String cityName) {
           //  TODO  your code goes here
           return null;
     }
}
