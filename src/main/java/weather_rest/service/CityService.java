package weather_rest.service;

import java.util.List;

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
           
           List<City> cities = cityRepository.findByName(cityName);
           if (cities.size() > 0) {
              // in case of multiple cities, take the first one.
              City city = cities.get(0);
              Country country = countryRepository.findByCode(city.getCountryCode());
              TempAndTime tempAndTime = weatherService.getTempAndTime(cityName);
              CityInfo cityInfo = new CityInfo(city, country, tempAndTime);
              return cityInfo;
           }
           
           else {
              return null;
           }
     }
}
