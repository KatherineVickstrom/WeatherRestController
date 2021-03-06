package weather_rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import weather_rest.domain.CityInfo;
import weather_rest.service.CityService;
 
@SuppressWarnings("unused")
@Controller
public class CityController {
   @Autowired
   private CityService cityService;             
   @GetMapping("/cities/{city}")
   public String getCityInfo(@PathVariable("city") String cityName,Model model) {
      CityInfo cityInfo = cityService.getCityInfo(cityName);
      if (cityInfo == null) {
              // error.  city not found
              model.addAttribute("error", "City not found. "+cityName);
              return "cityerror";
      } else {
              model.addAttribute("cityInfo", cityInfo);
              return "cityshow";
      }

   }
}

